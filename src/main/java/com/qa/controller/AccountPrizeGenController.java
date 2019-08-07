package com.qa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.qa.service.AccountPrizeGenService;

@RestController
@RequestMapping("/prizegen")
public class AccountPrizeGenController {
	
	private AccountPrizeGenService accprizegenservice;
	
	@Autowired
	public AccountPrizeGenController(AccountPrizeGenService accprizegenservice) {
		this.accprizegenservice=accprizegenservice;
	}
	
	@GetMapping("/getPrize/{accNo}")
	public String getPrize(@PathVariable("accNo") String accNo) {
		return accprizegenservice.prizeDraw(accNo);
	}


}
