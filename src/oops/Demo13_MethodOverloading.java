package oops;

class A{
	int add() {
		return 10;
	}
	//1 method
}

public class Demo13_MethodOverloading extends A {
	//void add() will be inheritate from superclass
	void add(int a) {
		
	}
	
	void add(float b) {
		
	}
	void add(boolean n,int i ) {}

	public static void main(String[] args) {
		//add int it call to 1st add like same all will call 

		//add + add + add + add = adition we call
		//we need different names/methods for all addition
		//but need under 1 method and same method name
	//And,its called method overloading
		}

}
