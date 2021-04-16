/**
  * CC 12 B 
  * 18 Jan 2021
  */
class MainClass {

	public static void main(String args[]) {
	
		// user input
		int row = Integer.parseInt(args[0]);
		int col = Integer.parseInt(args[1]);
		
		if (row < 1 || row > 8 || col < 1 || col > 8) {
			System.out.println("Out of bounds, try again.. ");
			System.exit(0);
		}
		
		Board b = new Board();
		
		System.out.println("Printing the board initial values");
		b.print_board();
		
		b.set_cell(row-1, col-1, 1);
		System.out.println("Printing the board with row=" + row + " col=" + col + " set to 1");
		b.print_board();
	}	
}