package com.odx.testController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.odx.model.PalindromeModel;
import com.odx.respository.PalindromeRepository;
import com.odx.testService.PalindromeService;

@RestController
public class PalindromeController {
	
	@Autowired
	public PalindromeService palindromeService;
	
	public PalindromeModel palindromeModel;
	public PalindromeRepository repository;
	PalindromeController(PalindromeRepository repository){
		this.repository = repository;
	}
	
	
	@PostMapping("/sendString")
	public PalindromeModel inputPalindrome(@RequestBody String inputStr) {
		palindromeModel.setName(palindromeService.findAndSavePalindrome(inputStr));
		return repository.save(palindromeModel);
	}
}
