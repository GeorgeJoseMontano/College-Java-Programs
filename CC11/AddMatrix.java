import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int R, C;
		int count=1;
		R = input.nextInt();
		C = input.nextInt();
		int[][] A = new int[R][C];
		int[][] B = new int[R][C];
		int[][] S = new int[R][C];
		
		for( int r=0;r<R;r++){
			for(int c=0;c<C;c++){
				System.out.printl("Input "+count+"th element");
				A[r][c] =input.nextInt();
				count++;
			}
		}
		
		for( int r=0;r<R;r++){
			for(int c=0;c<C;c++){
				B[r][c] =input.nextInt();
			}
		}
		
		for( int r=0;r<R;r++){
			for(int c=0;c<C;c++){
				S[r][c] = A[r][c] + B[r][c];
			}
		}
		
		System.out.println();
		System.out.println();
		for( int r=0;r<R;r++){
			for(int c=0;c<C;c++){
				System.out.printf("%5d", S[r][c]);
			}
			System.out.println();
		}
	}
}