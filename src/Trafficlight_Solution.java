
public class Trafficlight_Solution {
//Red : "stop"
	//Green : "Go"
	//Amber :"Ready to Go"
	public static void main(String[] args) {
    
		String colour = "";
		//as per colour we share output will be as per the given colour
		//"" default value will be print
		//if we not add default value then output will be blank
		
		switch(colour) {
		case "Red" : System.out.println("STOP");
		break;
		case "Amber" : System.out.println("Ready to Go");
//we cannot put break here otherwise execution stop
		case "Green" : System.out.println("Go");
		break;
		default : System.out.println("No Colour");	
		}
		
	}

}
