package com.tech.apps.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.tech.apps.service.SumService;

public class SumServiceTest {

	
	
	@Test
	public void sumTest() {
		
		SumService service=new SumService();
		int expected=10;
		assertEquals(expected, service.sum(5, 5));
	}
}
