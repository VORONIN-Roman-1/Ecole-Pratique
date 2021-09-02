package entity;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;

public class Exercice2 {
	public int[] tableDeck(int[] m){
		//List<Integer> list =  Arrays.stream(m).boxed().collect(Collectors.toList());
		
		//List<Integer> listOrd1 = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		// Integer[] list1 = (Integer[]) Arrays.stream(m).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList()).toArray();
		int[] list =  Arrays.stream(m).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue)
	            .toArray();;
		
		return list;
	}
}
