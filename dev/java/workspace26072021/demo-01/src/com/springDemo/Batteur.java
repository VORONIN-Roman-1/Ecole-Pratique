package com.springDemo;

public class Batteur implements Musicien {
	private PrepareService service;
	private String  emailAddresse;
	private String site;

	public Batteur() {
		super();
		System.out.println("Bateur: Contr");
	}

	@Override
	public String joueTaPartition() {
		return "Je joue du tambours";
	}

	@Override
	public String getPrepa() {
		return service.getPreparation();
	}

	

	public void setPrepareService(PrepareService service) {
		System.out.println("Bateur: SETTER");
		this.service = service;
	}

	public String getEmailAddresse() {
		return emailAddresse;
	}

	public void setEmailAddresse(String emailAddresse) {
		System.out.println("Batteur : a l'interieur de la methode set - setEmailAdresse");
		this.emailAddresse = emailAddresse;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		System.out.println("Batteur : a l'interieur de la methode set - setSite");
		this.site = site;
	}


//	public void setService(PrepareService service) {
//		System.out.println("Bateur: SETTER");
//		this.service = service;
//	}
//	

}

