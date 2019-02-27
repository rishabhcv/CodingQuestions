package com.esp.interviews.strings;

public class AnagramRemoval {

	public static void main(String[] args) {
		String str1 = "XJK";
		String str2 = "ANXMJKQQ";

		anagramCount(str1, str2);
	}

	private static void anagramCount(String str1, String str2) {

		int removeCount = 0;

		int[] arrA = new int[26];
		int[] arrB = new int[26];

		char[] strA = str1.toCharArray();
		char[] strB = str2.toCharArray();

		for(int i=0;i<strA.length;i++) {
			arrA[strA[i] - 'A']++;
		}

		for(int i=0;i<strB.length;i++) {
			arrB[strB[i] - 'A']++;
		}

		for(int i=0;i<26;i++) {
			removeCount+=Math.abs(arrA[i]-arrB[i]);
		}

		System.out.println(removeCount);
	}

}
