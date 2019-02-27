package com.esp.interviews.strings;

import java.util.HashMap;

public class LongestCommonSub {

	public static void main(String[] args) {
		String str1 = "aaabhgeeeiqou";
		String str2 = "bbhaaeyyikkoou";
		lcsOfVowels(str1,str2);
	}

	private static void lcsOfVowels(String str1, String str2) {

         HashMap<Character,Integer> hm1 = new HashMap<>();
         HashMap<Character,Integer> hm2 = new HashMap<>();
         
         char[] charA = str1.toCharArray();
         char[] charB = str2.toCharArray();
         char[] charC = {'a','e','i','o','u'};
         
         int sizeA = charA.length;
         int sizeB = charB.length;
         int lcs = 0;
         
         for(int i =0;i<sizeA;i++) {
        	 if(!hm1.containsKey(charA[i])) {
        		 hm1.put(charA[i], 1);
        	 } else {
        		 hm1.put(charA[i], hm1.get(charA[i])+1);
        	 }
         }
         
         for(int i =0;i<sizeB;i++) {
        	 if(!hm2.containsKey(charB[i])) {
        		 hm2.put(charB[i], 1);
        	 } else {
        		 hm2.put(charB[i], hm2.get(charB[i])+1);
        	 }
         }
         
         System.out.println(hm1);
         System.out.println(hm2);
         
         for(int i =0;i<charC.length;i++) {
        	 if(hm1.containsKey(charC[i]) && hm2.containsKey(charC[i])) {
        		 if(hm1.get(charC[i]) == hm2.get(charC[i])) {
            		 lcs = lcs + hm1.get(charC[i]);
            	 } else {
            		 lcs=lcs+ (hm1.get(charC[i])>hm2.get(charC[i]) ? hm2.get(charC[i]) :hm1.get(charC[i]));
            		 //lcs+= Math.abs(hm1.get(charC[i])-hm2.get(charC[i]));
            	 } 
        	 }
         }
         
		System.out.println(lcs);
	}

}
