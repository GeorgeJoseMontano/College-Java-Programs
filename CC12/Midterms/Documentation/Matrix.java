/**
  * CC 12 - MidTerm Examination
  * Name:
  * Date:
  *
  * Your task is to finish this program such that it will output the product of 
  * the two matrices defined inside the main method (matrix_a and matrix_b)
  * 
  * The format of the output should look similar the input matrices.
  *
  * You may use this page for reference:
  * https://www.mathsisfun.com/algebra/matrix-multiplying.html
  */
  
class Matrix {
	
	public static void main(String args[]) {
	
		int matrix_a[][] = { {1,2,3}, {4,5,6} };
		int matrix_b[][] = { {7,8}, {9,10}, {11,12} };

		

		/*
		 * Lines 27-42 simply prints the contents of the two matrices
		 */
		for(int i=0;i<2;i++) {   

			for(int j=0;j<3;j++) {    
				System.out.print(matrix_a[i][j]+ " ");
      		}
			System.out.println();//new line    
		}
		
		System.out.println("X");
		
		for(int i=0;i<3;i++) {    
			for(int j=0;j<2;j++) {    
				System.out.print(matrix_b[i][j]+ " ");
      		}
			System.out.println();//new line    
		}

	}
}
