package com.AccessSpecifier2;

import com.AccessSpecifier1.Demo1;


public class Demo4 {
	int a = 200;
	void d1(){
		
	}

	public static void main(String[] args) {

	//can I access default members in same class
				
				Demo4 d4 = new Demo4();
				System.out.println(d4.a);
				d4.d1();
					
				}

	}
class demo5{
	void test5(){
	
		Demo4 d4 = new Demo4();
	System.out.println(d4.a);
	d4.d1();
	}
}


