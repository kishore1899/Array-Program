package com.palle;

import java.util.Arrays;
import java.util.Scanner;

public class Shorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int[] a= new int[5];
		for(int i=0;i<=a.length-1;i+=1) {
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		for(int i =0;i<=a.length-1;i+=1) {
			for(int j=i+1;j<a.length;j=j+1) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
//			System.out.println(Arrays.toString(a));
		}
		System.out.println(Arrays.toString(a));

	}

}
