package org.Dep_proj2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MultiplyTest {

	@Test
	void test() {
		Multiply m=new Multiply();
		Assertions.assertEquals(m.mul(2, 3), 6);
	}

}
