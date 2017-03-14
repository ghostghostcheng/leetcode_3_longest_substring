package leetcode_3_longest_substring;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) {
        	//s.length() = 0 or 1
            return s.length();
        }
        
        String subStr = s.charAt(0) + "";
        String newSubStr = subStr;
        
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            
            for (int j = 0; j < newSubStr.length(); j++) {
            	
                 if (c == newSubStr.charAt(j)) {
                    if (subStr.length() <= newSubStr.length()) {
                        subStr = newSubStr;
                    }
                    newSubStr = newSubStr.substring(j + 1) + "";
                    newSubStr = newSubStr + c;
                    break;           
                } else if (j == newSubStr.length() -1) {
                	//c != newSubStr.charAt(j)
                    newSubStr = newSubStr + c;
                    break;
                } 
            }
        }
        
        if (subStr.length() < newSubStr.length()) {
            subStr = newSubStr;
        }
        return subStr.length();
    }
}