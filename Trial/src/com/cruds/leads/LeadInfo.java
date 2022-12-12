//$Id$
package com.cruds.leads;

public class LeadInfo {
	int leadID;
	String leadName,emailID,company;
	public LeadInfo(int leadID,String leadName, String emailID, String company) {
		this.leadID = leadID;
		this.leadName = leadName;
		this.emailID = emailID;
		this.company = company;
	}
	public LeadInfo(String leadName, String emailID, String company) {
		super();
		this.leadName = leadName;
		this.emailID = emailID;
		this.company = company;
	}
	public int getLeadID() {
		return leadID;
	}
	public String getLeadName() {
		return leadName;
	}
	public String getEmailID() {
		return emailID;
	}
	public String getCompany() {
		return company;
	}
	public void setLeadID(int leadID) {
		this.leadID = leadID;
	}
	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "leadID :" + leadID + ", leadName :" + leadName + ", emailID : " + emailID + ", company : " + company + "]";
	}
	
}
