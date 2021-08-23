package caculateOne;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class caculateMultiplyTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testCaculatemultiply() {
		caculateMultiply cmultiply = new caculateMultiply();
		double ans = cmultiply.caculatemultiply(2, 3);
		assertEquals(ans, 6);
	}

	@Test
	void testCaculatedivide() {
		caculateMultiply cmultiply = new caculateMultiply();
		double ans = cmultiply.caculatedivide(3, 2);
		assertEquals(ans, 1.5);
	}

}
