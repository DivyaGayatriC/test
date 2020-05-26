package com.odx.testService;

import org.springframework.stereotype.Component;

@Component
public interface PalindromeService {
	public String findAndSavePalindrome(String str);

}
