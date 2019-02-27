package com.esp.interviews.strings;

import java.util.Arrays;

public class StringReplace {

	public static void main(String[] args) {

        String str1 = "abcdegg";
        String str2 = "xyzz";
        String str3 = str1 + str2;
        char[] c = str3.toCharArray();
        StringBuilder sb = new StringBuilder();
        Arrays.sort(c);
        for(int i = 0; i<c.length ; i++) {
        	sb.append(c[i]);
        }
        
        sb.reverse();
        System.out.println(sb.toString().substring(0,str1.length()));

	}

}
