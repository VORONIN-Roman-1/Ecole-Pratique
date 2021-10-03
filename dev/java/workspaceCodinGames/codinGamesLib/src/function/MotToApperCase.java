package function;

import java.util.Collection;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class MotToApperCase {
	public static String motToAp(String str) {
		//Matcher mth = Pattern.compile("^\\w|\\W\\w").matcher(str);
		Matcher mth = Pattern.compile("^\\w|[^\\w\\\']\\w").matcher(str);
		while (mth.find())
			str = str.replaceFirst(mth.group(), mth.group().toUpperCase());
		return str;
	}

	public static String motToAp2(String str) {
		String text = str;
		Stream<String> upperWords = Stream.of(text.split("[\\P{L}]+"))
				.map(w -> w.substring(0, 1).toUpperCase() + w.substring(1, w.length()));
		upperWords.forEach(System.out::println);

		return str;
	}
}
