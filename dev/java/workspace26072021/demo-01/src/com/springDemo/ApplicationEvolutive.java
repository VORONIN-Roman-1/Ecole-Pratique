package com.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationEvolutive {

	public static void main(String[] args) {
			ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
			ClassPathXmlApplicationContext context1= new ClassPathXmlApplicationContext("applicationContext.xml");
			System.out.println(context);
			System.out.println(context1);
			Musicien musicienA =context.getBean("monMusicien", Musicien.class) ;
			Musicien musicienB =context.getBean("monMusicien", Musicien.class) ;
			context1.close();
			context.close();

	}

}
