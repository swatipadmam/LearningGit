package oops;

abstract interface Idemo {

	public abstract void testI();

	public static final int a = 10;

	interface Idemo2 {
		public abstract void testI();


	}

	interface Idemo3 {
		public abstract void testI();


	}

	interface Ddemo extends Idemo2, Idemo3 {
		//multiple inheritance only possible through interface 

	}

	public class Demo17_Interface {

		public static void main(String[] args) {
//Idemo I1 = new Idemo();,we no need to call by object
		}

	}
}

//by default is public static final(its added default) int

/*
 * class B implements Idemo{ public void testI() { int a = 10; } }
 */
// abstrct added by complier automatically if I used ();
//its a type of class,its conations only abstarct method
// no consrete method allowed
