package com.AccessSpecifier1;

import com.AcessSpecifier3.Demo7;

public class Demo8 extends Demo7 {

	public static void main(String[] args) {
		
		Demo8 d7 = new Demo8();
		//we need change object and class name as class name here
		System.out.println(d7.b);
		d7.test7();
		
		//we can access using inheritance
		
		//protected mebrs canot acesss outside pacage
	}

}
