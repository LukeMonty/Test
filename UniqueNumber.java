package test;

public class UniqueNumber {
	
	static int a = (int) (Math.random() * 10);
	static int b = (int) (Math.random() * 10);
	static int c = (int) (Math.random() * 10);
	
	
	public static void main(String[] args) {
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		addNumbers(a, b, c);
		
		
	}
	
	public static void addNumbers(int a, int b, int c){
		if(a == b) {
			b=0;
			a=0;
		}
		if(a == c){
			a = 0;
			c = 0;
			
		}
		if (b == c) {
			b = 0;
			c = 0;
			
		}
		System.out.println("The unique sum is " + (a + b + c));
			
	}

}
