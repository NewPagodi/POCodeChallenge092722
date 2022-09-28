package com.thaleswell;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LargestGapTest {

	@Test
	void largestGapTest01() {
		int[] arr = new int[] {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5};
		int actual = Main.largestGap(arr);
		int expected = 11;
		
		assertEquals(expected, actual);
	}

	@Test
	void largestGapTest02() {
		int[] arr = new int[] {14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7};
		int actual = Main.largestGap(arr);
		int expected = 4;
		
		assertEquals(expected, actual);
	}
	
	@Test
	void largestGapTest03() {
		int[] arr = new int[] {13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9};
		int actual = Main.largestGap(arr);
		int expected = 2;
		
		assertEquals(expected, actual);
	}
	
	
}
