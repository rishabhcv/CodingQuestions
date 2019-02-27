package com.esp.interviews.arrays;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencySort {

	public static void main(String[] args) {
		int[] arr = {2,5,8,7,7,7,0,1,2,5,5,5};
        
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			if(!hm.containsKey(arr[i])) {
				hm.put(arr[i], 1);
			} else {
				hm.put(arr[i], hm.get(arr[i])+1);
			}
		}
		
		final class FrequencyComparator implements Comparator <Integer>{

			Map<Integer, Integer> refmap;
			 
			public FrequencyComparator(HashMap<Integer, Integer> hm1) {
                this.refmap = hm1;
			}
			
			@Override
			public int compare(Integer o1, Integer o2) {
				Integer i1 = refmap.get(o1);
				Integer i2 = refmap.get(o2);
				
				int num = i1.compareTo(i2);
				return (num==0? (o1).compareTo(o2):num);
			}
		}
		
		FrequencyComparator fcomp = new FrequencyComparator(hm);
		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>(fcomp);
		tm.putAll(hm);
		
		for(Integer key : tm.keySet()) {
			for(int i=0;i<tm.get(key);i++) {
				System.out.println(key + " ");
			}
		}
	}

}
