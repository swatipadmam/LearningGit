class parent {
	void test() {
//1 member in parent class
	}
}class child extends parent {
	void test2() {
		// 2 members using inheritated 1 member
}}
public class Demo19_TypeCasting_NonPrimitiveCasting {
public static void main(String[] args) {
		parent p1 = new parent();
		p1.test();
child c1 = new child();
		c1.test2();
		c1.test();
parent p2 = new child();// its called upcasting
//here am expecting child class behave like parent class
// p2.test2(); //own method will not access
p2.test(); // child class bhv like parent

//child c2 = new parent();//trying to do direct downacsting : we will get complier time error
//child c2 = (child) new parent();
// Error : Exception in thread "main" java.lang.ClassCastException: class parent cannot be cast to class child (parent and child are in unnamed module of loader 'app')
//at Demo19_TypeCasting_NonPrimitiveCasting.main(Demo19_TypeCasting_NonPrimitiveCasting.java:29)
		// p2 upcasted by behave like parent

child c2 = (child) p2;// behave like child class
//down casting
		c2.test();
		c2.test2();
	}

}
