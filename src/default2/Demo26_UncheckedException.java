package default2;

public class Demo26_UncheckedException {

	public static void main(String[] args)  {


		System.out.println("Line 1");
		
   try{
	   int result = 10/0;//10/0 here we handle exception using try catch 
  int[] arr = new int[5];
  arr[6] = 10; //its throws outof bound expection
  }
   
	catch(ArithmeticException e) {
   //for 1 try block we can write multiple catch() block
		System.out.println("print this");
		
	}
   catch(ArrayIndexOutOfBoundsException e) 
   //every exception is a inbuilt class in java
   
   {
	   System.out.println("2nd one");
   }
   finally {
	   System.out.println("Check finally");
	   //it will execute even exception is their
   }

		//int result = 10/0;
		//here complier not able to chcek error 

		System.out.println("End Line 1");
	}

}
