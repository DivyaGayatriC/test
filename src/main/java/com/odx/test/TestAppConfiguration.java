package com.odx.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.odx.testService.PalindromeService;
import com.odx.testService.PalindromeServiceImpl;

@Configuration
@EnableJpaRepositories
public class TestAppConfiguration {
	@Bean
	public PalindromeService palindromeService() {
		return new PalindromeServiceImpl();
	}
	
}
