package entity;

import java.util.ArrayList;
import java.util.List;

public class Exercice3 {
	
	List<String> list;
	public Exercice3() {
		list = new ArrayList<>();
	}
	public void addToList(String s) {
		if (!list.contains(s)) {
			list.add(s);
			System.out.println("ADD "+ s);
		}
		else System.out.println("Exist "+ s);
	}
	public void removeIntoList(String s) {
		if (list.contains(s)) {
			list.remove(s);
			System.out.println("Remouve "+s);
		}
		else System.out.println("Not Exist "+ s);
	}
	
}
