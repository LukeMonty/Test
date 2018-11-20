package test;

public class BlackJack {
	
	static int firstHand[] = new int[2];
	static int secondHand[] = new int[2];
	static int sumFirstHand = 0;
	static int sumSecondHand = 0;

	public static void main(String[] args) {
		
		blackJackFirstHand();
		blackJackSecondHand();
		compareHands(sumFirstHand, sumSecondHand);
	}

	public static int blackJackFirstHand() {

		for (int i = 0; i < 2; i++) {
			int range = (11 - 1) + 1;

			firstHand[i] = (int) (Math.random()*range) + 1;
			System.out.println("Hand 1: Card " + (i + 1) + " is " +firstHand[i]);

		}
		for (int i = 0; i < firstHand.length; i++) {
			sumFirstHand += firstHand[i];

		}

		System.out.println("First Hand total is " + sumFirstHand);


		
		return sumFirstHand;
		
	}
	
	public static int blackJackSecondHand() {
		
		for (int i = 0; i < 2; i++) {
			int range = (11 - 1) + 1;

			secondHand[i] = (int) (Math.random()*range) + 1;
			System.out.println("Hand 2:Card " + (i + 1) + " is " +secondHand[i]);

		}
		for (int i = 0; i < secondHand.length; i++) {
			sumSecondHand += secondHand[i];

		}

		System.out.println("Second Hand total is " + sumSecondHand);
		
		return sumSecondHand;
	}
	
	
	public static void compareHands(int sumFirstHand, int sumSecondHand) {
		
		if (sumFirstHand < sumSecondHand) {
			
			System.out.println("Second hand is bigger:" + sumSecondHand);
			
		}
		if (sumFirstHand > sumSecondHand) {
			
			System.out.println("First hand is bigger:" + sumFirstHand);
			
		}
		else if (sumFirstHand == sumSecondHand){
			
			System.out.println("Draw");
		}
	}

}
