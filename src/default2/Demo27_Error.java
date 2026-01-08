package default2;

public class Demo27_Error {

	public static void main(String[] args) {

		Demo27_Error d27 = new Demo27_Error();
		d27.test1();
	}
	void test1(){
		test2();
		
	}
void test2() {
	test1();
	
	//stackoverflow error
}
}
