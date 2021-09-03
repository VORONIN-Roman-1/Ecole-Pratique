package entity;

import java.util.List;
import java.util.stream.Stream;

public class Ex7 {
	public int CountAnagrammes(List<String> list) {
		list.stream().map(x->x.toLowerCase()).map(x->x.split("")).map(x)
		//list.stream().map(x->x.toLowerCase()).map(String::chars).map(x->Stream<Char>(x).sorted().map(x->new String(x)).;
		//list.stream().map(String::toLowerCase).map(String::chars).map(x->Stream<Char>(x).sorted().co);
		return 0;
	}
}
