package com.springDemo;

import org.springframework.stereotype.Component;

@Component("monMusicien")
public class Violoniste implements Musicien {
	
	public Violoniste() {
		System.out.println("Const Violoniste");
	}

	@Override
	public String joueTaPartition() {
		return "Je joue  la vase à 3 temps";
	}

	@Override
	public String getPrepa() {
		//System.out.println(service.getPreparation());
		return null;
		//return service.getPreparation();
	}

}
