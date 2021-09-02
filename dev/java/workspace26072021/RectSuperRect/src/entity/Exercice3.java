package entity;

import java.util.ArrayList;
import java.util.List;

public class Exercice3 {
	
	private List<String> list;

	public Exercice3() {
		list = new ArrayList<>();
	}
	public void addToList(String s) {
		if (!list.contains(s)) {
			list.add(s);
		}
	}
	public void removeIntoList(String s) {
		if (list.contains(s)) {
			list.remove(s);
		}
	}
	public List<String> getList() {
		return list;
	}
}
