package test;

public class Main {
	
	static int a = 12;
	static int b = 35;
	static int c;
	
	
	public static void main(String[] args) {
		System.out.println("Hello first task");
		hello();
		addTwoNumbers(a,b, true);
		System.out.println(c);
		
		array();
		
	}
	public static void hello() {
		System.out.println("Hello World");
	}
	public static int addTwoNumbers(int a,int b, boolean d) {
		
		if (d) {
			c = a+b;
		}
		
		if (c > 20) {
			System.out.println(a);
			System.out.println(b);
			System.out.println("A + B = C =" + c);
			System.out.println("C is more than 20");
		}
		
		if (a == 0 || b == 0 ) {
			System.out.println(c + " one of the numbers is 0");
		}
		
		for(int i = 0 ; i < 10; i++) {
			
			System.out.println(i);
			
		}
		return c;

	}
	
	private static void array() {
		
		int array1[]={33,3,4,5,45,63,22,34,919,21};
		
		int[] numbers = new int[11];
		
		for (int i = 0; i < array1.length; i++) {
			
			System.out.println("Array1 index number " + (i) + " is " + array1[i]);
			
		}
		for (int i = 0; i < 10; i++) {
			numbers[i] = (int) (Math.random()*100);
			System.out.println("Array2 index " + (i) + " is " + numbers[i]);
		}
	}
	 
	
	
}