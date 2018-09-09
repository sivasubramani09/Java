package dailyChallenge;

import java.util.Scanner;
/*
	Nth term in Mixed Geometric Series
	
	The program must accept an integer N as the input. The program must print the Nth term in the series as the output.
	NOTE : The order of series must be 1, 1, 2, 3, 4, 9, 8, 27, 16, 81, 32, 243, 64, 729, 128, 2187, 256, 6561, 512, 19683, ... This series is a mixture of 2 series - all the odd terms in this series form a geometric series and all the even terms form another geometric series. 
	
	Boundary Condition(s):
	1 <= N <= 30
	
	Input Format:
	The first line contains the value of N .
	
	Output Format:
	The first line contains the Nth term in the series.
	
	Example Input/Output 1:
	Input:
	3
	
	Output:
	2
	
	Example Input/Output 2:
	Input:
	21
	
	Output:
	1024  
 */
public class NthTermInMixedGeometricSeries {
	public static void main(String[] args) {
		System.out.println("Enter the value of N:");
		Scanner sc = new Scanner(System.in);
		int start =1;
		int r1 = 2;	// Common Ratio of GP 1
		int r2 = 3;	// Common Ratio of GP 2
		int n = sc.nextInt();
		System.out.println((n%2!=0) ? NthGP(start,r1,(n/2)+1) : NthGP(start, r2, n/2));
		sc.close();
	}
	public static String NthGP(int a,int r,int N)
	{ 
	String str = String.valueOf( a * (Math.pow(r, N - 1)) );
	return str.substring(0, str.length()-2);
	}
}
