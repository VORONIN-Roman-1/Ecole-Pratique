package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestException {

	public static void main(String[] args) {
			List <String> list = new ArrayList<>();
			list.add("Hello");
			list.add("World");
			list.add("hello");
			list.add("utka");
			list.sort(String::compareTo);
			System.out.println(list.toString());
			
		try { 
			Pattern p= Pattern.compile("(\\d{2}[\\. -]?){4}\\d{2}");
			Matcher m = p.matcher("0605 04.0302");
		System.out.println(m.matches());
			Object a = new Object();
			new TestException().a();
			new Th().run();
			new Thread(new Th()).run();
			int i=5/1;
		} 
		catch (ArithmeticException e) {
			System.out.println("3");
			// TODO: handle exception
		}
		catch (RuntimeException e) {
				// TODO: handle exception
			System.out.println("1");
			}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("2");
		}
		

	}
	
	public final void a() {
		final int b=0;
		byte c=3;
		byte d=5;
		String a="bc";
		System.out.println(a.compareTo("bv"));
		
	}

}

class Th implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}

@FunctionalInterface
interface A {
	int plus(int i,int j);
	
	default int minus(int i, int j) {
		return i - j;
	}

}
@FunctionalInterface
interface C {
	int plus(int i,int j);
	
	default int minus(int i, int j) {
		return i * j;
	}

}

@FunctionalInterface
interface B extends A, C{

	@Override
	default int minus(int i, int j) {
		// TODO Auto-generated method stub
		
		return A.super.minus(i, j);
	}
	
	
}

