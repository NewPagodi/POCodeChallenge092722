package com.thaleswell;

import java.util.Arrays;

public class Main {

	public static int largestGap(int... arr) {
		int[] newArray = arr.clone();
		
		Arrays.sort(newArray);
		
		int largestSoFar = 0;
		int curGap = 0;
		
		for ( int i = 1 ; i < newArray.length ; ++i ) {
			curGap = newArray[i] - newArray[i-1];
			
			if ( curGap > largestSoFar ) {
				largestSoFar = curGap;
			}
		}
		
		return largestSoFar;
	}
	
	
	public static void main(String[] args) {

		int[] arr = new int[] {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5};
		
	}

}
