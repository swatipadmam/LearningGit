package oops;

abstract class TV {
	//tv association rules are below so its abstraction
	abstract void display();

	abstract void sound();
}
//parent class creating rules

class samsung extends TV {
	void display() {
		System.out.println("Display");
	}

	void sound() {
		System.out.println("Stereo");
	}

}
//TV associate guideline is mandatory but adding new modules is not under rules and regulations

public class Demo16_Abstraction2 {

	public static void main(String[] args) {

		samsung s1 = new samsung();
		s1.sound();
		s1.display();
		/* output = Stereo & display */
	}

}
//eligible criteria for canditate define by HR
//but their eduction n all depends on canditates
//Rule are defined and need implementation for this
