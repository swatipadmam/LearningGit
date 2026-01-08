package oops;

class Bank{
	private int Balance = 5000;
	//we need to hide this variable so we need to make it private
private int Account_Number = 1234;

int getAccountNumber() { //getter method 
	return Account_Number;
	
}
//need to give read access only
int readBalance() //getter methods which helps to share/return data
//we added balance as return so instaed of void we use int
{
	
//To return data we use "return" keyword
	return Balance;
	}

void setBalance(int a) {
	//set value I will share here
	//setter method 
	
	Balance = a;
	
	
}
}
public class Demo12_Encapsulation {
	
	

	public static void main(String[] args) {
Bank b = new Bank();

b.setBalance(10000);//user want to set value
//with private we cannot access write now
// we have write access so we update the balance amount
System.out.println(b.readBalance());//now output = 5000 //read access
//output = 10000
//But,in real time we canot have write access
	}

}
