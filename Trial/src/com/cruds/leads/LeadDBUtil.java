//$Id$
package com.cruds.leads;

import java.sql.*;
import java.util.*;

public class LeadDBUtil {
	
	public static final String INSERT_LEAD_SQL = "INSERT INTO LEADS " + "(LEAD_NAME, EMAIL_ID, COMPANY) VALUES " + "(?, ?, ?);";
	public static final String SELECT_TEN_LEAD_SQL = "SELECT * FROM LEADS LIMIT 10 OFFSET ?";
	public static final String SELECT_LEAD_SQL = "SELECT * FROM LEADS WHERE LEAD_ID = ?";
	public static final String SEARCH_LEAD_SQL = "SELECT * FROM LEADS WHERE LEAD_NAME LIKE ?"+" OR COMPANY LIKE ?";	
	public static final String UPDATE_LEAD_SQL = "UPDATE LEADS SET LEAD_NAME = ?, EMAIL_ID = ?, COMPANY = ? WHERE LEAD_ID=?;";
	public static final String DELETE_LEAD_SQL = "DELETE FROM LEADS WHERE LEAD_ID = ?;";
	public static boolean createLead(LeadInfo lead) {
		int rowUpdated = 0;
		try(Connection con = DBUtil.getConnection()){
			PreparedStatement stmt = con.prepareStatement(INSERT_LEAD_SQL);
			stmt.setString(1, lead.getLeadName());
			stmt.setString(2, lead.getEmailID());
			stmt.setString(3, lead.getCompany());
			rowUpdated = stmt.executeUpdate();	
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return rowUpdated>0;
	}
	
	public static LeadInfo getLeadInfo(int id) {
		LeadInfo selectedLead = null;
		try(Connection con = DBUtil.getConnection()){
			PreparedStatement stmt = con.prepareStatement(SELECT_LEAD_SQL);
			stmt.setInt(1, id);
			ResultSet result = stmt.executeQuery();	
			while(result.next()) {
			String leadName = result.getString("LEAD_NAME");
			String emailID = result.getString("EMAIL_ID");
			String company = result.getString("COMPANY");
			selectedLead =new LeadInfo(leadName, emailID, company);
			}
			return selectedLead;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}
	public static List<LeadInfo> searchLeads(String substring) {
		LeadInfo lead =null;
		List<LeadInfo> matchingLeads = new LinkedList<>();
		try(Connection con = DBUtil.getConnection()){
			PreparedStatement stmt = con.prepareStatement(SEARCH_LEAD_SQL);
			stmt.setString(1, "%"+substring+"%");
			stmt.setString(2, "%"+substring+"%");
			ResultSet result = stmt.executeQuery();
			while(result.next()) {
				int leadID = Integer.parseInt(result.getString("LEAD_ID"));
				String leadName = result.getString("LEAD_NAME");
				String emailID = result.getString("EMAIL_ID");
				String company = result.getString("COMPANY");
				matchingLeads.add(new LeadInfo(leadID,leadName, emailID, company));
			}
			stmt.close();	result.close();
			return matchingLeads;

		}
		catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}		
	/**
	 * @param id
	 * @return
	 */
	public static List<LeadInfo> showLeads(int page) {
		List<LeadInfo> allLeads = new ArrayList<>();
		try(Connection con = DBUtil.getConnection()){
			PreparedStatement stmt = con.prepareStatement(SELECT_TEN_LEAD_SQL);
			stmt.setInt(1, (page-1)*10);
			ResultSet result = stmt.executeQuery();
			while(result.next()) {
				int leadID = Integer.parseInt(result.getString("LEAD_ID"));
				String leadName = result.getString("LEAD_NAME");
				String emailID = result.getString("EMAIL_ID");
				String company = result.getString("COMPANY");
				allLeads.add(new LeadInfo(leadID,leadName, emailID, company));
			}
			stmt.close();	result.close();
			return allLeads;

		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return null;
	}
	public static boolean updateLead(int idToBeUpdated, LeadInfo existingLeadInfo, LeadInfo updateLeadInfo) {
		boolean rowUpdated = false;
		System.out.println(existingLeadInfo+"\n"+ updateLeadInfo+"\n"+idToBeUpdated);
		String leadName = updateLeadInfo.getLeadName(), emailID = updateLeadInfo.getEmailID(), company = updateLeadInfo.getCompany();
		try(Connection con = DBUtil.getConnection()){
			PreparedStatement stmt = con.prepareStatement(UPDATE_LEAD_SQL);
			if(leadName == null || leadName.trim().length() < 1) {
				stmt.setString(1, existingLeadInfo.getLeadName());
			}
			else {
				stmt.setString(1,leadName);
			}
			if(emailID == null || emailID.trim().length() < 1) {
				stmt.setString(2, existingLeadInfo.getEmailID());
			}
			else {
				stmt.setString(2, emailID);
			}
			if(company ==null || company.trim().length() < 1) {
					stmt.setString(3, existingLeadInfo.getCompany());
			}
			else {
				stmt.setString(3, company);
			}
			stmt.setInt(4,idToBeUpdated);
			rowUpdated = stmt.executeUpdate() > 0;
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return rowUpdated;
	}
	public static boolean deleteLead(int id) {
		System.out.println(id);
		boolean rowDeleted = false;
		try(Connection con = DBUtil.getConnection()){
			PreparedStatement stmt = con.prepareStatement(DELETE_LEAD_SQL);
			stmt.setInt(1, id);
			rowDeleted = stmt.executeUpdate() > 0;			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return rowDeleted;
	}
}