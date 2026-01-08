package com.AcessSpecifier3;

public class Demo7 {
	
	protected int b = 20;
	protected void test7() {}

	public static void main(String[] args) {
   
		Demo7 d7 = new Demo7();
		System.out.println(d7.b);
		d7.test7();
		}
	}

/*class Demo{
	void test77() {
	
	Demo7 d7 = new Demo7();
	System.out.println(d7.b);
	d7.test7();
	}
}*/
//we can access protected members in same class
//same .javafile
