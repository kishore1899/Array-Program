package com.palle;

public class MothedsOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaabcaeiovheaoiueuaeoheuvFGheu";
		String s1 = "";
		String max = "";
//		s=s.toLowerCase();
//		System.out.println(s);
		for (int i=0;i<=s.length()-1;i++) {
			char ch = s.charAt(i);
			if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u') {
				s1+=' ';
			}
			else
				s1+=s.charAt(i);
		}
		System.out.println(s1);
		String[] s2=s1.split(" ");
		max=s2[0];
		for(int i=1;i<s2.length;i++) {
			if(s2[i].length()>max.length()) {
				max=s2[i];
			}
		}
		System.out.println(max);
	}
}
