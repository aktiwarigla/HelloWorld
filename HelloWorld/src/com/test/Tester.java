package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tester {

	@Test
	void test() {
		Student s = new Student();
		assertEquals(20,s.add(15, 5));
	}

}
