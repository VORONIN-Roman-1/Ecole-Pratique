package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import entity.Singleton;

class SingletonTest {

	@Test
	void testInstance() {
		String s1= Singleton.instance();
		String s2= Singleton.instance();
		assertSame(s1, s2);
	}

}
