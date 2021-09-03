package entity;

import java.util.List;
import java.util.stream.Stream;

public class Ex7 {
	public long CountAnagrammes(List<String> list) {
		if (list!=null) {
			long count= list.stream().parallel()
				.map(x->x.toLowerCase())
				.map(x->Stream.of(x.split(""))
				.sorted().reduce(String::concat))
				.distinct()
				.count();
			return list.size()-count;
		}
		return 0;
	}
}
