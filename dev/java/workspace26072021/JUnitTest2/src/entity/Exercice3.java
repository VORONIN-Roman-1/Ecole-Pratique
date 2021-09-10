package entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercice3 {
	
	private List<String> list;
	private Set<String> set;

	public Exercice3() {
		list = new ArrayList<>();
		set = new HashSet<>();
		
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
	
	public void addToSet(String s) {
		set.add(s);
	}
	public void removeIntoSet(String s) {

		set.remove(s);
	}
	public Set<String> getSet() {
		return set;
	}
}
