package com.esp.interviews.arrays;

import java.util.HashSet;

public class SubsetArray {

	public static void main(String[] args) {
		int arrA[] = {4,7,8,12,11,23};
		int arrB[] = {4,8,11,1};

		checkIfSubArray(arrA, arrB);

	}

	private static void checkIfSubArray(int[] arrA, int[] arrB) {
		HashSet<Integer> hs = new HashSet<>();

		for(int i = 0; i<arrA.length; i++) {
			if(!hs.contains(arrA[i])) {
				hs.add(arrA[i]);
			}
		}

		for(int i = 0; i<arrB.length; i++) {
			if(!hs.contains(arrB[i])) {
				System.out.println("Not a sub array");
				return;
			} 
		}
		System.out.println("Sub array");
	}

}
