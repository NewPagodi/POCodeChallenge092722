package com.thaleswell;

import java.util.Arrays;

public class Main {

	public static int largestGap(int... arr) {
		// Preserve the original array.
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
		
	}

}
