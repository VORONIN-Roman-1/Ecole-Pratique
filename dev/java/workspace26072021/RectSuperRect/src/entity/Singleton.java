package entity;

public class Singleton {
	private  static String singleton;
	public static String instance() {
		if(singleton==null) {
			singleton = "Singleton";
			return singleton;
		}
		return singleton;
	}
}
