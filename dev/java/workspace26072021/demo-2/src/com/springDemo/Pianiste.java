package com.springDemo;

import org.springframework.stereotype.Component;

@Component
public class Pianiste implements Musicien {
	@Override
	public String joueTaPartition() {
		return "Je joue piano";
	}

	@Override
	public String getPrepa() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}