package com.sdetlabs.s42;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddTest2 {

	@Test
	public void addString() {
		assertEquals("Hello" + "world", "Hello world");
	}


}
