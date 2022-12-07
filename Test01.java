package com.palle;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		int[] a= {1,9,4,5,2,8,1,2,7,3,0};
		for (int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				i=-1;
				}
		}
		System.out.println(Arrays.toString(a));

	}

}
