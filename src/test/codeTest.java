package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class codeTest {

	@Test
	void test() {
		code cd=new code();
		int result=cd.add(100, 200);
		assertEquals(300, result);
	}

}
