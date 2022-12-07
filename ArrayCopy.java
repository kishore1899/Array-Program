package com.palle;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 element");
		int[] array =new int[10];
		for(int i=0;i<=array.length-1;i+=1) {
			array[i]=sc.nextInt();
			}
		System.out.println("Given Array is");
		System.out.println(Arrays.toString(array));
	
	
		int[] array2=new int[array.length];
		
		for(int i=0;i<=array.length-1;i+=1) {
			array2[i]=array[i];
		}
		System.out.println("Coping Array");
		System.out.println(Arrays.toString(array2));

		
		for(int i=0;i<=array.length-1;i+=1) {
			array2[i]=array[array.length-1-i];
		}
		System.out.println("Revers copy ");
		System.out.println(Arrays.toString(array2));

		System.out.println("Revers Order in alternet ");
		for(int i=array.length-1;i>=0;i=i-2) {
			System.out.print(array[i]+" ");
		}
	}

}
