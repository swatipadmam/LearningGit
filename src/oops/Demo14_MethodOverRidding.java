package oops;

//uber ola have map but they using google map services
//but ,map looks diff from google map
//they chng the implimntation to in method from google map parent class
class parent {
	void test() {
		System.out.println("I am parent");
	}
}

class child extends parent {
	void test() {
		System.out.println("I am child");
		// if child class wants to execute somethingelse
	}
}

// same method as parent calss with diff and same implementation{}
public class Demo14_MethodOverRidding {
	public static void main(String[] args) {
		child c1 = new child();
		c1.test();
		
		// now child class will print output : I am child //using child we can call
		// parent class
        //output = I am parent
		
		parent p1 = new parent();
		p1.test();
		// it will call old interface of parent class
	}

}
