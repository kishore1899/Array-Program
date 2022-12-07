package com.palle;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int[] a= {12,12,13,14,15,16};
		System.out.println(Arrays.toString(a));
		for (int i=0;i<=a.length-1;i+=1) {
			if(i%2==0) {
				a[i]=a[i]+(i+1);
			}
			else {
			a[i]=a[i]-(i+1);
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
