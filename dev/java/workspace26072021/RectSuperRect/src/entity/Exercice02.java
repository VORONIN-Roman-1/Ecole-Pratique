package entity;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;

public class Exercice02 {
	public List<Integer> tablToInteger(int[] m){
		List<Integer> list =  Arrays.stream(m).boxed().collect(Collectors.toList());
		
		//List<Integer> listOrd1 = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		List<Integer> list1 =  Arrays.stream(m).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		return null;
	}
}
