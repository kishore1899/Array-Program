package com.palle;

import java.util.Arrays;
import java.util.Scanner;

public class SwapEvery2Element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value");
		int input[]=new int[11];
		for(int i=0;i<=input.length-1;i=i+1) {
			input[i]=(int)(Math.random()*10);
//			input[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(input));
//		int[] input = {1,2,1,2,1,2};
		for(int i=0;i<input.length-1;i=i+2) {
			int temp=input[i];
			input[i]=input[i+1];
			input[i+1]=temp;
		}
		System.out.println(Arrays.toString(input));

 	}

}
