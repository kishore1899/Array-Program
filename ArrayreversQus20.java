package com.palle;

import java.util.Arrays;

public class ArrayreversQus20 {

	public static void main(String[] args) {
		char[] ch= {'m','n','u','d','l','a','d','q'};
		char[] ch1= new char[ch.length];
		for(int i=0;i<ch.length;i++) {
			
		ch1[i]= (char)(ch[i]+1);
			
		}
		System.out.println(Arrays.toString(ch1));
		
		

	}

}
