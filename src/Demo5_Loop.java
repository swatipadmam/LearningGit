
public class Demo5_Loop {

	public static void main(String[] args) {
//simple for loop : for(initialization; condition; increment)
		int num = 5;
		
		for(int i =1;i<=5;i++) {
			System.out.println(num);
		}
		
		/*Enhanced For Loop : iterate over arrays and collections ,using variable we can store only 1 values 
		 but using arrays and collection we can store multiple values
		 */
		int[] arr = {10,20,30}; //arrays store inside {}
		
		for(int a : arr) {
			System.out.println(a);
		}
		//I want to select check boxes in gmail,what ever count today it will not same tmrw : 20:55
		
		/*While loop statement : While is an entry check loop*/
		System.out.println("--------------------------------");
		
		int i = 1;
		
		while(i<5) {
			
			System.out.println(i);
			i++;
			
			//here i = 1 ,condition is true so while loop execute the block
			//output = infinite bcz we arenot updating i value here ,so every time condition will true and jvm execute the while block
			//where we need to update i value ? inside the while block
		}
		/*Do While Loop : */
		
		
		System.out.println("-----------------------------");
		int j = 1;
		do 
		{
			System.out.println(j);
			j++;
		
		}
		while(j>5);//false condition : Loop will terminate
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
