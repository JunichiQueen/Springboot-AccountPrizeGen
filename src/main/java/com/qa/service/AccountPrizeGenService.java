package com.qa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountPrizeGenService {
	

	
	public String prizeDraw(String accNo) {
		if (accNo.charAt(1) == '3') {
			return "50";
		}
		if (accNo.charAt(1) == '5') {
			return "100";
		} else {
			return "0";
		}
	}


}
