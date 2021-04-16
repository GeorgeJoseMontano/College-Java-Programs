/**
  * CC 12 B 
  * 18 Jan 2021
  */

class Board {

	int[][] board;

	// constructor
	public Board() {
		
		this.board = new int[8][8];
		
		for (int i = 0; i < 8; i++) {
		
			for (int ii = 0; ii < 8; ii++) {
			
				this.board[i][ii] = 0;
			}	
		}	
	}
	
	/**
	  * prints the contents of the board
	  */
	public void print_board() {
			
		for (int i = 0; i < 8; i++) {
		
			for (int ii = 0; ii < 8; ii++) {
			
				System.out.print(this.board[i][ii] + " ");			
			}	
			System.out.println();
		}
		System.out.println();
	}	
	
	/**
	  * assign a value to a cell (row, col)
	  */
	public void set_cell(int row, int col, int value) {
	
		this.board[row][col] = value;
	}	
}