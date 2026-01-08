
public class Demo3_DesicionStatement {
	//Day_6(10-09-2025)

	public static void main(String[] args) {
    //IF  Statement : set of code which depends upon a condition,it will execute till end of code
		
		int age = 18;
		
		if (age>=18) {
			System.out.println("Eligible for DL");
		}
		
		//If - else condition : it will execute both true/fasle code and output = True statement as per condition
		//if,If block false then it will not executed that block
		/*if (age<= 18) {
			System.out.println("Not eligible for DL");
			//Output = Eligible for DL      Not eligible for DL
		}*/
		else {
			System.out.println("Not Eligible for DL");
		}
		
		System.out.println("-------------------------------------------");
	//class demo3 {

         int a = 10;
         int b = 20;
         int c = 30;
         
       //  boolean findgreater() {
         if (a<b && a<c){
        	 System.out.println("a is greater");
         }
         else if (b<a && b<c) {
        	System.out.println ("b is greater");
         }
         else {
        System.out.println	("c is greater");
         }
	       
	
         }
	
	
	}


