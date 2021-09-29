package com.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MonApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		Musicien musicien =context.getBean("monMusicien", Musicien.class) ;
		
		System.out.println(musicien.joueTaPartition());
		System.out.println(musicien.getPrepa());
		
		Batteur batteur =context.getBean("unBatteur", Batteur.class) ;
		//System.out.println(batteur.joueTaPartition());
		//System.out.println(batteur.getPrepa());
		System.out.println(batteur.getEmailAddresse());
		System.out.println(batteur.getSite());
		context.close();
	}

}
