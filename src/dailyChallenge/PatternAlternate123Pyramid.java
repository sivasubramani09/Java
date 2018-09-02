package dailyChallenge;

import java.util.Scanner;
/*
	input 1: 5
	output 1: 
	1
	3 2
	4 5 6
	10 9 8 7
	11 12 13 14 15
	
	input 2: 8
	output 2:
	Enter the no. of rows:
	1 
	3 2 
	4 5 6 
	10 9 8 7 
	11 12 13 14 15 
	21 20 19 18 17 16 
	22 23 24 25 26 27 28 
	36 35 34 33 32 31 30 29 
	
 */
public class PatternAlternate123Pyramid {
	public static void main(String[] args) {
		System.out.println("Enter the no. of rows:");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int num=1;
		int sub =1;
		int temp = 0;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2==0) {
					System.out.print((temp+i-sub)+" "); // 7+4-1 //7+4-2 //7+4-3 //7+4-4
					sub++;					
				}
				else {
					System.out.print(num+" ");					
				}
				num++;
			}
			temp=num;
			sub=1;
			System.out.println();
		}
		sc.close();
	}
}
