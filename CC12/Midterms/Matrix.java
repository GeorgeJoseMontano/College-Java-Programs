/**
  * CC 12 - MidTerm Examination
  * Name: Montano, George Jose P.
  * Date: February 22, 2020
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
		int temp;
		int matrix_c[][] = new int[2][2];

		/*
		 * First Matrix
		 */
		for(int i=0;i<2;i++) {   

			for(int j=0;j<3;j++) {    
				System.out.printf("%3d", matrix_a[i][j]);
				System.out.print(" ");
      		}
			System.out.println();//new line    
		}
		
		System.out.println();
		System.out.println("X");
		System.out.println();
		
		/*
		 * First Matrix
		 */
		for(int i=0;i<3;i++) {    
			for(int j=0;j<2;j++) {    
				System.out.printf("%3d", matrix_b[i][j]);
				System.out.print(" ");
      		}
			System.out.println();//new line    
		}
		
		/*
		 * Multiplication of the two matrices
		 */
		 
		for(int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) 
			{
                for (int c = 0; c < 3; c++) 
				{
                    temp = matrix_a[i][c] * matrix_b[c][j];
					matrix_c[i][j] = matrix_c[i][j] + temp;
                }
            }
        }
		
		System.out.println();
		System.out.println("=");
		System.out.println();
		
		for(int i=0;i<2;i++) {    
			for(int j=0;j<2;j++) {    
				System.out.printf("%3d", matrix_c[i][j]);
				System.out.print(" ");
      		}
			System.out.println();//new line    
		}
	}	
}
