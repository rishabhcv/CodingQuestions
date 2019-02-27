package com.esp.interviews.strings;

public class Subsequence {

	public static void main(String[] args) {
		String str1 = "XJK";
		String str2 = "ANXMJK";
		
		isSubsequence(str1,str2);
	}

	private static void isSubsequence(String str1, String str2) {
		
		int m= str1.length();
		int n= str2.length();
		
		for(int i =0,j=0; i<m && j<n; j++) {
			if(str1.charAt(i)==str2.charAt(j))
				i++;
			if(i==m)
				System.out.println("It is!");
			else if(j==n-1)
				System.out.println("It's not");
		}
		
		
		
	}

}
