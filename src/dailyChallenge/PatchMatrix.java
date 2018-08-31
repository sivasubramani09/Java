import java.util.Scanner;
public class PatchMatrix {
	public static void main(String args[]) {
		int[][] m1 = new int[3][3];
		int[][] m2 = new int[3][3];
		int[][] m3 = new int[3][3]; 
		int row;
		int col;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows and Column: ");
		row = sc.nextInt();
		col = sc.nextInt();
			System.out.println("\nEnter the elements of the First matrix:\n");
			for(int i=0; i<row; i++) {
				for(int j=0; j<col; j++) {
					m1 [i][j] = sc.nextInt();
				}
			}
			System.out.println("\nEnter the elements of the Second Matrix:\n");
			for(int i=0; i<row; i++) {
				for(int j=0; j<col; j++) {
					m2 [i][j] = sc.nextInt();
				}
			}
			System.out.println("\nThe addition of two Matrix is:\n");
			for(int i=0; i<row; i++) {
				for(int j=0; j<col; j++) {
					m3 [i][j] = m1 [i][j] + m2[i][j] ;
					System.out.print(m3 [i][j]+" ");
				}
				System.out.println();
			}
	}

}
