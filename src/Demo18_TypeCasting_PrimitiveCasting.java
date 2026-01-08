
public class Demo18_TypeCasting_PrimitiveCasting {

	public static void main(String[] args) {

		/*
		 * byte b = 100;
		 * 
		 * int i = b; // after this int converted from byte System.out.println(b);// 100
		 * System.out.println(i);// 100
		 */

		// Explicit Narrowing

		int a = 130;
		byte b = (byte) a;
		// () cast operator >> 1st convert >> initiallize
System.out.println(b); //-126 as per byte converstion
	}
//-128 -127 -126 to 126 127 128
	//128 129 130 131..............
}
