package dailyChallenge;

import java.util.Scanner;

/*
	 Consecutive 1's Count
	
	The program must accept a matrix of size RxC as input. The program must print the count of consecutive 1's column-wise as the output.
	
	Boundary Condition(s):
	1 <= R, C <= 100
	
	Input Format:
	The first line contains the value of R and C.
	The next R lines contain C integers (0's and 1's) separated by space.
	
	Output Format:
	The first line contains the count of consecutive 1's column-wise.
	
	Example Input/Output 1:
	Input:
	5 4
	1 0 1 1 
	1 0 0 1 
	0 1 1 1 
	1 0 0 0 
	1 1 1 1
	
	Output:
	3
	
	Explanation:
	In the first column, there are two consecutive 1's.
	In the last column, there is one consecutive 1's.
	Hence the output is 3.
	
	Example Input/Output 2:
	Input:
	5 6
	0 0 1 1 0 1 
	0 0 1 0 0 1 
	0 1 1 1 0 0 
	0 1 0 0 1 1 
	0 0 0 0 0 1
	
	Output:
	4
 */
public class Consecutive1sCount {
	public static void main(String[] args) {
		System.out.println("Enter the no. of rows and columns:");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int count=0;
		int[][] a = new int [r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int col = 0;col<c;col++) {
			for(int row = 0;row<r-1;row++) {
				int current = a[row][col];
				int next = a[row+1][col];
				if(current == 1 && next == 1) {
					count++;
					row++;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}
