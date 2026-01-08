package com.Arrays;

public class Demo21_Arrays {

	public static void main(String[] args) {

		int arr[] = {10,20,30,40,50,60};
		
		//int arr[] = new int [5];
		
		arr[0] = 100;
		
		//System.out.println(arr.length);
	//	using simple for loop
	/*	for(int i =0;i< 5;i++) {
		System.out.println(arr[i]);
		}*/
		//using enhanced for loop
		
		for(int a : arr ) {
			System.out.println(a );
		}
		
		
	}

}
