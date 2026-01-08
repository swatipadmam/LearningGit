public class Demo8C {
	// constructor

	Demo8C() {
		// constructor block
		/*
		 * Constructor name should be same as classname(Demo8C()) constuctor not need
		 * any return type as method
		 */
		System.out.println("I am constructor");
	}

	/*// method
	void test() {
		System.out.println("I am test");
	}
*/
	public static void main(String[] args) {

		Demo8C d1 = new Demo8C();
		//without creating constructor block also we can create object using constructo
		//Its called default constructor
		//default constructor always have empty 
		//d1.test();
		Demo8C d2 = new Demo8C();

	}

}
