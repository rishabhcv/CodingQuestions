package com.esp.interviews.arrays;

public class SubArraySum {

	public static void main(String[] args) {
		//4*5,5*8,6*9,12*8,13*5
		int arr[] = {4,5,6,12,13};
		int sum=0;
		for(int i=0; i<arr.length; i++)
			sum=sum+arr[i]*(arr.length-i)*(i+1);
		System.out.println(sum);
	}

}
