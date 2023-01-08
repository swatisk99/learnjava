//$Id$
package com.test;

import java.util.HashMap;
import java.util.Map;

/**
 * Class to perform validation and extraction in uri based on a given pattern
 * 
 * @author swati-15154
 *
 */
public class URLUtils {
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
		String[] keyList = new String[patternItems.length];
		Map<String,String> keys = new HashMap<>();
		// key value pairs are identified from the pattern
		for (int i = 0, j = 0; i < patternItems.length; i++) {
			String item = patternItems[i];
			if (item.matches("\\{[a-zA-Z0-9]+\\}")) {
				keyList[j] = item.substring(1, item.length() - 1);
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
					keys.put(keyList[j], items[i]);
					return keys;
				}
				if(patternItems[i+1].matches("\\{[a-zA-Z0-9]+\\}")){
					keys.put(keyList[j], "null");
					return keys;
				}
				else {
					throw new Exception("Incomplete URI");
				}
			}
			if (patternItems[i].matches("\\{[a-zA-Z0-9]+\\}")) {	// matches variables in the uri	
				// if key was not last and key has an empty value string, exception is thrown
				if (items[i].isEmpty()) {
					throw new Exception("Value for " + keyList[j] + " is mandatory");
				} 
				else {
					if (items[i].matches("[a-zA-Z0-9._-]+")) {
						keys.put(keyList[j++],items[i]);
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
				throw new Exception("Invalid URI pattern");
			}
		}
		return keys;
	}

	public static void main(String[] args) throws Exception {
		String uriPattern = "{version}/a/b/{as}/df/sadf/df";
		String actualUri = "1.0/a/b/aa";
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
