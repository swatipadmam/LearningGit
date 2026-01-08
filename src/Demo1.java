public class Demo1 {
	//Day5 StarAgile
	
	/*method : retuns value when it called and 
	  jvm execute code from main method */
	
	static int a = 10;
	public static void main(String[] args) {
		//System.out.println("first code for Method");
		//test();
		//test1();
		
		//test2();
		
		//main method cannot have return type 
		
		System.out.println(add (10,20)); //bcz we use return type,So it will print only this value=30
		add(40,70); //we didnot use s.o.p ,So it will not print this num values
	
	}
	
	static void test() {
		System.out.println(a);
		System.out.println("calling this branch method from this test block");
		//here void means null,so here no return type mentioned
	}
	static char test1 () {
		System.out.println("calling character");
     return ('c');		
	}
	static int test2() {
		System.out.println("This method return int types");
		return 10;
		//here we mentioning int/chat etc ,So we mentioning return type also
	}
	
	/*static Demo2() {
		System.out.println("Return type will char");
		
		return Demo2();*/
	

/*static void add() {
	int a =10;
	int b =20;
	System.out.println(a+b);
	Here we cannot change number value again & again,
	So we can do it by parameter form please check below
	*/
	
	//example using addition 
    static int add(int a,int b) {
		int result = a+b;
	
	//System.out.println(result);
	//use return keyword for print data-type
	//for this we need to change void to int for print return value
	return result ;
	//method can return only 1 data at a time
	
	
}
}



