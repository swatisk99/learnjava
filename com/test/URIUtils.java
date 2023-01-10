//$Id$
package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class to perform validation and extraction in uri based on a given pattern
 * 
 * @author swati-15154
 *
 */
public class URIUtils {
	/**
	 * uriPattern gives idea of keys and corresponding value's tag. on iterating over the url keys are identifed and it's values are returned
	 * @param uri
	 * @param uriPattern
	 * @return
	 * @throws Exception
	 */
	public static Map<String,String> extractURLKeys(String uri, String uriPattern) throws Exception {

		// splits url pattern wrt '/'
		String[] patternItems = uriPattern.split("/");
		List<String> keyList = new ArrayList<String>();
		Map<String,String> keys = new HashMap<>();
		// key value pairs are identified from the pattern
		for (int i = 0, j = 0; i < patternItems.length; i++) {
			String item = patternItems[i];
			if (item.matches("\\{[a-zA-Z0-9]+\\}")) {
				String token = item.substring(1, item.length() - 1);
				//Check if key name already exists
				for(int k=0;k<j;k++) {
					if(keyList.get(k).equals(token)) {
						throw new Exception("URI pattern cannot have same variable name");
					}
				}
				keyList.add(item.substring(1, item.length() - 1));
				j++;
//				 System.out.println(keyName[j]+" : "+keyList[j++]); //(j++)here if uncomment
			}
		}
		StringBuilder result = new StringBuilder();
		
		String[] items = uri.split("/");
		if(items.length > patternItems.length) {
			throw new Exception("Given URI larger than URI pattern provided");
		}
		int patternLength  = patternItems.length;
		int uriLength = items.length;
		for (int i = 0, j = 0; i < patternLength; i++) {
			// System.out.println(keyList[j]);
			if(i == uriLength-1) {
				if(i == patternLength-1 && patternItems[i].equals(items[i])) {
					return keys;
				}
				if(patternItems[i].matches("\\{[a-zA-Z0-9]+\\}")){
					keys.put(keyList.get(j), items[i]);
					return keys;
				}
				if(patternItems[i+1].matches("\\{[a-zA-Z0-9]+\\}")){
					keys.put(keyList.get(j), "null");
					return keys;
				}
				else {
//					if(j==keyList.size() && i<patternItems.length-1)
					throw new Exception("Incomplete URI");
				}
			}
			if (patternItems[i].matches("\\{[a-zA-Z0-9]+\\}")) {	// matches variables in the uri	
				// if key was not last and key has an empty value string, exception is thrown
				if (items[i].isEmpty()) {
					throw new Exception("Value for " + keyList.get(j) + " is mandatory");
				} 
				else {
					if (items[i].matches("[a-zA-Z0-9._-]+")) {
						keys.put(keyList.get(j++),items[i]);
					} 
					else {
							throw new Exception("Invalid URI");
						}
				}
				
			}
			else if(patternItems[i].equals(items[i])){
				continue;
			} 
			else {	// Non matches
				throw new Exception("Invalid URI");
			}
		}
		return keys;
	}

	public static void main(String[] args) throws Exception {
		String uriPattern = "meeting/{key}/token/{token}/all/{start}/start";
		String actualUri = "meeting/111/token/11/all";
		System.out.println(extractURLKeys(actualUri, uriPattern));
	}
}
//
//
// if(items[0].equals("v1") && items[1].equals("people") && items[3].equals("location") && items[5].equals("spot")) {
// if(items[2].equals("")) {
// throw new Exception("Value for pid is mandatory");
// }
// if(items[4].equals("")) {
// throw new Exception("Value for lid is mandatory");
// }
// if(items[2].matches("[a-zA-Z0-9_-]+")) {
// if(items[4].matches("[a-zA-Z0-9_-]+")) {
// if(items.length==7 && !items[6].matches("[a-zA-Z0-9_-]+")) {
// return false;
// }
// return true;
// }
// }
// }
// return false;
// }
//
// public static String extractURLValues(String url){
// String [] items = url.split("/");
// return "pid-"+items[2]+", lid-"+items[4]+", spot-"+(items.length==7 ? items[6] : "null");
//
// }
// }
