package org.Dep_proj;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddsumTest {

	@Test
	void test() {
		Addsum a=new Addsum();
		Assertions.assertEquals(a.sum(3, 4), 7);
		
	}

}
