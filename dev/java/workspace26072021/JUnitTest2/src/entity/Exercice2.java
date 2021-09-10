package entity;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;

public class Exercice2 {
	public int[] tableDeck(int[] m){
		int[] list =  Arrays.stream(m).parallel().boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue)
	            .toArray();;
		
		return list;
	}
}
