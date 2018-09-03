package dailyChallenge;

import java.util.Scanner;

/*
	Pattern Printing with Two Characters (using one for loop)
	
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
public class PatternPrintingWithTwoCharactersAlternate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows and two characters:");
		int row=sc.nextInt();
		String str1 = sc.next();
		String str2 = String.valueOf(str1.charAt(1))+String.valueOf(str1.charAt(0));	//reverses str1
		String rep="";	//replace
		int incr = 1;
		for(int i=1;i<=row;i++) {
			rep = (i%2==1) ? str1 : str2;
			String space = new String(new char[row-i]).replace("\0"," ");
			System.out.print(space);
			String s = new String(new char[(incr/2)+1]).replace("\0", rep);
			System.out.print(s.substring(0,incr));
			incr += 2;
			System.out.println();
		}
		sc.close();
	}
}
