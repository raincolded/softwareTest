package caculateOne;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class caculateAddTest {
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	
	@Test
	void testCaculateadd() {
		caculateAdd cadd = new caculateAdd();
		double ans = cadd.caculateadd(5, 8);
		assertEquals(ans, 13);
	}

	@Test
	void testCaculateminus() {
		caculateAdd cadd = new caculateAdd();
		double ans = cadd.caculateminus(8, 5);
		assertEquals(ans, 3);
	}

}
