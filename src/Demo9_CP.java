//Parameterized constructor
public class Demo9_CP {
	
	Demo9_CP(float a)
	//we pass data here so below object also we added data
	{
		//constructor body empty here 
		//int result = 10 + a;
	}

	public static void main(String[] args) {
    
	Demo9_CP cp = new Demo9_CP(12.20f);
	//we have to use f manually or implicitily for flost
	
	System.out.println(cp);
	}

}
