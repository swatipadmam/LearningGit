
public class Demo7_StaticandNonstaticMembers {
static int a = 10;
//here a = variable
//static mem belongs to class 
static void test() {
	//including main method 3 memebrs avail 2 method and 1 variable
}

//int b = 20;

//its nonstatic its belong to objects
	public static void main(String[] args) {
		
		Demo7_StaticandNonstaticMembers.a = 100;
		//jvm create static and non static copy it we update a value jvm also update value in copy


		System.out.println(Demo7_StaticandNonstaticMembers.a);
		//we can call it directly bcz jvm add class name automatically
		
	/*	Demo7_StaticandNonstaticMembers d7 =	new Demo7_StaticandNonstaticMembers();
		System.out.println(d7.b); //out put = 10 & 20*/
		
	}

}
