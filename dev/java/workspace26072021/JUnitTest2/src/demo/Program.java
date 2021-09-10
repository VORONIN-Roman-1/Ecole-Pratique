package demo;

import java.lang.reflect.Field;
import java.util.List;

import entity.Exercice2;
import entity.Exercice3;

public class Program {
	
	public static Integer intToInteger(int i) {
		return i;
	}
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		System.out.println(intToInteger(5));
		
		
		Exercice3 ex3 = new Exercice3();
		ex3.addToList("Hello");
		ex3.addToList("world");
		ex3.addToList("world");
		
		Class cls = ex3.getClass();
		Field field =  cls.getDeclaredField("list");
		field.setAccessible(true);
		List<String> value = (List<String>) field.get(ex3);
		System.out.println(value);
	}
	
}
