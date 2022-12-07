package com.palle;

import java.util.Arrays;
import java.util.Scanner;

public class IndexNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 element");
		int[] array =new int[10];
		for(int i=0;i<=array.length-1;i+=1) {
			array[i]=sc.nextInt();
			}
		System.out.println(Arrays.toString(array));
		System.out.println("Enter number");
		int n = sc.nextInt();
		int flag=0;
		
		
		for (int i=0;i<=array.length-1;i+=1) {
			if(n==array[i]) {
				System.out.println(i);
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("-1");
		}

	}

}
