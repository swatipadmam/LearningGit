
public class Demo4_Switchstatement {

	public static void main(String[] args) {
		// Day6_9.30pm
		
		/*Syntaxt :
		 * 
		 * switch(choice){
		 * case 1 : System.out.println("case 1");
		 * case 2 : System.out.println("case 2");
		 * case 3 : System.out.println("case 3");
		 * default : System.out.println("default value");
		 * 
		 * *** if any invalid value given then default value will be print}*/
		
		String machine = "Samsung";
		
		switch("Samsung") {
		
		case "Samsung" : System.out.println("Samsung : fridge");
		break;
		case "Hyundaii" : System.out.println("TV");
		break;
		case "Samsui" : System.out.println("Wasing Machine");
		break;
		default : System.out.println("default");}
		/*with out break keyword : output = 
		 * fridge
		 * 	TV
Wasing Machine
default*/
		
		

	}

}
