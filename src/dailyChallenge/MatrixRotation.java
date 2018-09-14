package dailyChallenge;

import java.util.Scanner;
/*
	An image is represented as a matrix. Each element represents the pixels of the image.
	You have to rotate the image to right if flag is 0 or to left if flag is 1.
 */
public class MatrixRotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\"An image is represented as a matrix.\nEach element represents the pixels of the image.\nYou have to rotate the image to right if flag is 0\nor to left if flag is 1.\"");
		System.out.println("\nEnter the no. of rows & columns:");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int arr[][] = new int [m][n];
		System.out.println("Enter the elements of the matrix: ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter 0 for right & 1 for left:");
		int flag = sc.nextInt();
		MatrixRotation mr = new MatrixRotation();
		mr.rotate(arr, flag, m, n);
		sc.close();
	}
	public void rotate(int[][] image, int dir, int maxRow, int maxCol) {
		if(dir == 1) {
			for(int j=maxCol-1; j>=0;j--) {
				for(int i=0; i<maxRow;i++) {
					System.out.print(image[i][j]+" ");
				}
				System.out.println();
			}
		}
		if(dir == 0) {
			for(int j=0; j<maxCol;j++) {
				for(int i=maxRow-1;i>=0;i--) {
					System.out.print(image[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}
