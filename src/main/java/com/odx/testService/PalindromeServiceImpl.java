package com.odx.testService;

public class PalindromeServiceImpl implements PalindromeService {
	
	@Override
	public String findAndSavePalindrome(String str) {

	        if(str.isEmpty()) {
	            return "";
	        }
	        int n = str.length();
	        int longestSoFar = 0, startIndex = 0, endIndex = 0;
	        boolean[][] palindrom = new boolean[n][n];

	        for(int j = 0; j < n; j++) {
	            palindrom[j][j] = true;
	            for(int i = 0; i < j; i++) {
	                if(str.charAt(i) == str.charAt(j) && (j-i <= 2 || palindrom[i+1][j-1])) {
	                    palindrom[i][j] = true;
	                    if(j-i+1 > longestSoFar) {
	                        longestSoFar = j-i+1;
	                        startIndex = i;
	                        endIndex = j;
	                    }
	                }
	            }
	        }
	        return str.substring(startIndex, endIndex+1);
	}

}
