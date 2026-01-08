package com.AccessSpecifier1;

public class Demo1 {
	
	private int i = 10;//private class
	private void test() //private method
	{
		
	}
public static void main(String[] args) {
//try to access private mem in same class
	
	Demo1 d1 = new Demo1();
	System.out.println(d1.i);
	d1.test();
		
	}

}

class demo2{}
	
	//public static void main(String[] args) {}
		//try to access private mem in same class
			
			/*Demo1 d1 = new Demo1();
			System.out.println(d1.i);
			d1.test();
			cannot access private members out side the class in same pacage
*/
	
