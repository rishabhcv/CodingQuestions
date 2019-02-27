package com.esp.interviews.arrays;

import java.util.HashMap;
import java.util.Map;

public class SumAbcd {

	static class Pair{
		int x, y;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	public static void main(String[] args) {


		int arr[] = {1,9,4,5,3,2};

		printPairs(arr);
	}

	private static void printPairs(int[] arr) {
		Map<Integer, Pair> hm = new HashMap<Integer, Pair>();

		if(arr.length == 0) {
			System.out.println("Empty array");
			return;
		}

		for(int i= 0;i<arr.length-1;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				Integer sum = arr[i]+arr[j];
				Pair p = new Pair(arr[i], arr[j]);

				if(!hm.containsKey(sum)) {
					hm.put(sum, p);
				} else {

					Pair p1 = hm.get(sum);
					System.out.println("Pairs are "+ arr[i]+ "," + arr[j] + " & " + p1.x + ","+ p1.y);
				}
			}
		}

	}

}
