package com.AcessSpecifier3;

import com.AccessSpecifier2.Demo4;

public class Demo6 {
public int a = 30;
public void test6() {
	
}
	public static void main(String[] args) {

		/*Demo4 d4 = new Demo4();
		System.out.println(d4.a);
		d4.d1();*/
		//default members cannot be call outside of the package
		Demo6 d6 = new Demo6();
		System.out.println(d6.a);
		d6.test6();}
	

}


