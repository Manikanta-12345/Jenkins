package com.tech.apps.service;

import org.springframework.stereotype.Service;

@Service
public class SumService {

	public int sum(int param1,int param2) {
		return param1+param2;
	}
}
