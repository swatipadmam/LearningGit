package default2;

public class Demo24_Exceptions {
	


	public static void main(String[] args) {
		System.out.println("Line 1");//executed

		int result = 10/0;//ArithmeticException,after this code line
		
		System.out.println("End Line 1"); //jvm not able to execute this code

	}

}
