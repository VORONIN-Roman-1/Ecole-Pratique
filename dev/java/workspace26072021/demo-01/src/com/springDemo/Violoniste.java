package com.springDemo;

public class Violoniste implements Musicien {
	private PrepareService service;

	public Violoniste(PrepareService service) {
		super();
		this.service = service;
	}

	@Override
	public String joueTaPartition() {
		return "Je joue  la vase à 3 temps";
	}

	@Override
	public String getPrepa() {
		//System.out.println(service.getPreparation());
		//return null;
		return service.getPreparation();
	}

}
