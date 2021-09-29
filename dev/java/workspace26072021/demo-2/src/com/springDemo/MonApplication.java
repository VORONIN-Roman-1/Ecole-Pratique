package com.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MonApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		Musicien musicien =context.getBean("monMusicien", Musicien.class) ;
		Musicien musicien1 =context.getBean("pianiste", Musicien.class) ;
		
		System.out.println(musicien.joueTaPartition());
		System.out.println(musicien1.joueTaPartition());

		context.close();
	}

}
