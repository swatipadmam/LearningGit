public class Demo10_CO{
//constructor overloading
Demo10_CO(int a){
	
	System.out.println("Number of arguments should be different");
	
}
Demo10_CO(){
	
}
Demo10_CO(float f){
	
	System.out.println("Type of arguments should be different");
	
}
Demo10_CO(boolean b){
	
}

Demo10_CO(float a,int i){
	
	System.out.println("Sequence of arguments should be different");
	
}
Demo10_CO(int i,float g){
	
}


	

	public static void main(String[] args) {
		
		Demo10_CO overloading = new Demo10_CO(12);
		Demo10_CO overloading1 = new Demo10_CO(12.02f);
		Demo10_CO overloading2 = new Demo10_CO(true);
		Demo10_CO overloading3 = new Demo10_CO(13,13.03f);
		
		Demo1 check = new Demo1();
		//we can create other class name as object in other class
		//like one builder copy another builder blue-print




	}

}
