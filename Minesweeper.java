package test;


public class Minesweeper {
	
	public static void main(String[] args) {
		placeMines();
		
	}
	
	
	
	public static void placeMines() {
		
		int[][] mineField = new int[10][10];
		
		
		
		//
		for (int i = 0; i < mineField.length; i++) {
			System.out.println("");
			for (int j = 0; j < mineField.length; j++) {
				
				
				int randomI = (int) (Math.random()*10);
				int randomJ = (int) (Math.random()*10);
				mineField[randomI][randomJ] = 1;
				
				System.out.print("[" + mineField[i][j] + "]");
			}
			
		}
		
		
	}
	
	
	
}
