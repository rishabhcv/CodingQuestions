package com.esp.interviews.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DistinctPairs {
	
	static int pairs =0;
	static class Pair{
		Object x, y;

		public Pair(Object arr, Object arr2) {
			this.x = arr;
			this.y = arr2;
		}
		
		public String toString() {
			return this.x + " " + this.y;
		}
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,6,7,8,9,1};
		
		
		
		if(arr.length == 0) {
			System.out.println("Empty array");
			return;
		}
		
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i = 0; i<arr.length;i++) {
			hs.add(arr[i]);
		}
		
		System.out.println(hs);
		
		Object[] arrA = hs.toArray();
	
		printPairs(arrA);
	}
	
	private static void printPairs(Object[] arr) {
		Map<Integer, Pair> hm = new HashMap<Integer, Pair>();

		Integer givenSum = 10;
		for(int i= 0;i<arr.length-1;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				Integer sum = Integer.parseInt(arr[i].toString())   +Integer.parseInt(arr[j].toString());
				Pair p = new Pair(arr[i], arr[j]);
				
				if(sum == givenSum) {
					pairs++;
					System.out.println(pairs);
					System.out.println(p);
				}

				/*if(!hm.containsKey(sum)) {
					hm.put(sum, p);
				} else {
                    pairs++;
					Pair p1 = hm.get(sum);
					System.out.println("Pairs are "+ arr[i]+ "," + arr[j] + " & " + p1.x + ","+ p1.y);
					System.out.println(pairs);
				}*/
			}
		}

	}

}
