package com.esp.interviews.strings;

import java.util.Arrays;

public class StringReplace {

	public static void main(String[] args) {

        String str1 = "abcdegg";
        String str2 = "xyzz";
        String str3 = str1 + str2;
        StringBuilder sb = new StringBuilder();

        int[] charCount = new int[26];
        
        for(int i = 0; i<str3.length() ; i++) {
        	charCount[str3.charAt(i)-'a']++;
        }
        
        for(int i = 25;i>=0 ; i--) {
        	if(sb.length()==str1.length())
        	   break;
        	   
        	while(charCount[i]>0) {
        	    sb.append((char) (i+97));
        	    charCount[i]--;
        	}  
        }
        System.out.println(sb);
	}

}
