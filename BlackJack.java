package test;

public class BlackJack {
	
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		blackJack();
	}
	
	public static void blackJack() {
		int firstHand[] = new int[2];
		int secondHand[];
		int sum = 0;
		for (int i = 0; i < 2; i++) {
			int range = (11 - 1) + 1;
			
			firstHand[i] = (int) (Math.random()*range) + 1;
			System.out.println("Card " + (i + 1) + " is " +firstHand[i]);
			
		}
		for (int i = 0; i < firstHand.length; i++) {
			sum += firstHand[i];
			
		}
		
		System.out.println("Hand total is " + sum);
	}

}
