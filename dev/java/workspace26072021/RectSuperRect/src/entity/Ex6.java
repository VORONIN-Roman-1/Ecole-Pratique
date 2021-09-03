package entity;

import java.util.List;

public class Ex6 {
	public long CountDouble(List<Integer> list) {
		return list.size() - list.stream().mapToInt(Integer::intValue).distinct().count();
	}
}
