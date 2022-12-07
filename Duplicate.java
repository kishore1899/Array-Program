package com.palle;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Duplicate {

	public static void main(String[] args) {
		int[] a= {12,12,12,12,13,11,13,6,11,12,13,6,11,16};
		int c=1;
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length-c;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					c++;
					int l=j;
					for(int k=l+1;k<a.length;k++) {
						a[l]=a[k];
						l++;
					}
					j--;
				}
				
			}
		}
		c--;

		int [] b = new int[a.length-c];
		for(int i=0;i<a.length-c;i++) {
			b[i]=a[i];
		}
		System.out.println(Arrays.toString(b));

	}

}
