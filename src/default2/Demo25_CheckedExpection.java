package default2;

public class Demo25_CheckedExpection {

	public static void main(String[] args){

		try {
			Thread.sleep(2000);//what I want to execution
		} catch (InterruptedException e){//if condition getting expection it will check this code {
			e.printStackTrace();
			
			/*
			  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();*/
			
			
			
		}//throws expection
		//throws InterruptedException : 1st suggestion
		//complier able to check this error
	}

}
