package com.esp.interviews.arrays;

import java.util.Arrays;

public class TripletSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int[] arr = {4,5,6,12,20,8};
		int sum = 34;
		tripletSum(arr, sum);
	}

	private static void tripletSum(int[] arr, int sum) {
		Arrays.sort(arr); // 4,5,6,8,12,20
		for(int i = 0; i<arr.length-2;i++) {
			
			int l= i+1;
			int r = arr.length-1;
			while(l<r) {
				if(arr[i]+arr[l]+arr[r] == sum) {
					System.out.println(arr[i]+" "+arr[l]+" "+arr[r]);
					return;
				} else if(arr[i]+arr[l]+arr[r]<sum) {
					l++;
				} else
					r--;
			}
		}
	}
	

}
