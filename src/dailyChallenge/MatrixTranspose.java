/*
*This program is to find the Transpose of the given matrix.
*/
import java.util.Scanner;
public class MatrixTranspose{
	public static void main(String args[]) {
		int[][] m1 = new int[3][3];
		int[][] m2 = new int[3][3]; 
		int row;
		int col;
		int row2;
		int col2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows and Column: ");
		row = sc.nextInt();
		col = sc.nextInt();
			System.out.println("\nEnter the elements of the Matrix:\n");
			for(int i=0; i<row; i++) {
				for(int j=0; j<col; j++) {
					m1 [i][j] = sc.nextInt();
				}
			}
			System.out.println("\nThe Transpose of Matrix is:\n");
			for(int i=0; i<row; i++) {
				for(int j=0; j<col; j++) {
					m2 [i][j] = m1 [j][i];
					m2 [j][i] = m1 [i][j];                                                         
					System.out.print(m2 [i][j]+"\t");
				}
				System.out.println("\n");
			}

	}

}
