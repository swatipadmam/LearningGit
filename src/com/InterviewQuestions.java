package com;
//Reverse string method
//input = java
//output = avaj

public class InterviewQuestions {

	public static void main(String[] args) {
		
		String s = "Java";
		//without using inbuilt method
		
		for(int i = s.length()-1;i>=0;i--) {
		
		
		System.out.print(s.charAt(i));
		}
		//index = length - 1
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//using inbuilt method
		//StringBuffer and StringBuilder simillar like string class
		// StringBuffer sb = new StringBuffer(s);
		 //here string convert to stringbuffer
		 
		// System.out.println(sb.reverse());

	}

}
