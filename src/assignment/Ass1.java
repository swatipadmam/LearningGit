package assignment;

public class Ass1 {

	public static void main(String[] args) {
		// 1. Write a Java program to reverse a string with and without reverse() function

// Reverse string = java to avaj
		
		String str = "Java";
		
		String reversed ="";
		
		for (int i = str.length() -1; i>=0;i--){
		
		reversed =reversed +str.charAt(i);
		}
System.out.println(reversed); //output =avaJ

	}

}
