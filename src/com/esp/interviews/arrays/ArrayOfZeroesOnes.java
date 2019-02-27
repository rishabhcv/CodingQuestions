package com.esp.interviews.arrays;

public class ArrayOfZeroesOnes {

	public static void main(String[] args) {

		int arr[] = {1,0,1,0,1,0,1,1,0,0};
		sortArr(arr);
	}

	private static void sortArr(int[] arr) {

		int zCount=0;

		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0)
				zCount++;
		}

		int n = 0,k =zCount;
		while(n<zCount) {
			arr[n] = 0;
			n++;
		}

		while(k<arr.length) {
			arr[k] = 1;
			k++;
		}

		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}
}
