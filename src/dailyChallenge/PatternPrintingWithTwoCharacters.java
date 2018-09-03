package dailyChallenge;

import java.util.Scanner;

/*
	Pattern Printing with Two Characters
	
	The program must accept an integer N and two characters as input. The program must print the desired pattern as shown in the Example Input/Output section.
	
	Boundary Condition(s):
	1 <= N <= 50
	
	Input Format:
	The first line contains the value of N followed by a space and then the two characters(without any space between the two characters).
	
	Output Format:
	The first N lines contain the desired pattern as shown in the Example Input/Output section.
	
	Example Input/Output 1:
	Input:
	5 $#
	
	Output:
	    $
	   #$#
	  $#$#$
	 #$#$#$#
	$#$#$#$#$
	
	Example Input/Output 2:
	Input:
	6 @%
	
	Output:
	     @	
	    %@%
	   @%@%@
	  %@%@%@%
	 @%@%@%@%@
	%@%@%@%@%@%
	
*/
public class PatternPrintingWithTwoCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows and two characters:");
		int row=sc.nextInt();
		String str = sc.next();
		char c1 = str.charAt(0);
		char c2 = str.charAt(1);
		int flag =1;
		int incr =1;
		for(int i=1;i<=row;i++) {
			System.out.print(new String(new char[row-i]).replace('\0', ' '));
			for(int j=1;j<=incr;j++) {			
				System.out.print(flag==1 ? c1:c2);
				flag = (flag==1)?0:1;
			}
			incr +=2;
			System.out.println();
		}
		sc.close();
	}
}