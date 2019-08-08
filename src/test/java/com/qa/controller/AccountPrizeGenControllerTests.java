package com.qa.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.qa.service.AccountPrizeGenService;

public class AccountPrizeGenControllerTests {
	
	@InjectMocks
	AccountPrizeGenController controller;
	
	@Mock
	AccountPrizeGenService service;
	
	@Ignore
	@Test
	public void getPrizeTest() {
		
		String reply = service.prizeDraw("333333");
		assertEquals(controller.getPrize("333333"), reply);
		Mockito.when(service.prizeDraw("333333")).thenReturn("50");
		assertEquals(controller.getPrize("333333"), "50");
	}

}
