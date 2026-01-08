public class Demo20_String {

	public static void main(String[] args) {
//length method
		/*String s1 = "I am liking java";
		String s2 = "I will do job in java";*///its created non constant pool
		
		//System.out.println(s1.length());//11
		//System.out.println(s1.isEmpty());//true
		//System.out.println(s1.contains("java"));//true
		//System.out.println(s1==s2);//false
		/*String s1 = new String("java");
		String s2 = new String("java");
		//it comes under nonconstant pool
		System.out.println(s1.equals(s2));*///True
		
		/*String s1 = new String("Java");
		String s2 = new String("java");
		System.out.println(s1.equalsIgnoreCase(s2));*///true
		
		/*String s2 = "I love java";//change java to rava4
		System.out.println(s2.replace("java", "Rava"));*/
		//output = rava
		
		/*String str = "java";
		System.out.println(str.charAt(2));*///index start with 0 so in 2positin output = v
		
		/*String str ="I love java";
		System.out.println(str.startsWith("java"));*///false
		
		/*String str ="I love java";
		System.out.println(str.endsWith("java"));*///true
		
		/*String str ="I love java";
		System.out.println(str.toUpperCase());*///I LOVE JAVA
		
		/*String str ="I lOVE JAVA";
		System.out.println(str.toLowerCase());*///i love java
		
		
		/*String str = "           java         ";
		System.out.println(str.trim());*///java
		
	}

}
