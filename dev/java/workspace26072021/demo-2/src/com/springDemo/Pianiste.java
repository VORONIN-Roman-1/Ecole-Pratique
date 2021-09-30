package com.springDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")

public class Pianiste implements Musicien {
	@Value("${email}")
	private String email;
	@Value("${site}")
	private String site;
	@Override
	public String joueTaPartition() {
		return "Je joue piano";
	}

	@Override
	public String getPrepa() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}
	
	
}