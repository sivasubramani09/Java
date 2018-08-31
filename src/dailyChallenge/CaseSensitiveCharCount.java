package dailyChallenge;

import java.util.Scanner;

/*
	Case Sensitive Character Count
	
	Accept a string S, an integer N denoting the alphabet A position. Also another alphabet M indicating if the case must be lower or upper case. The program must print the count of alphabet A in the string S as the output. If the alphabet A is not present in S, then print -1.
	Note: M must be 'l' or 'L' to represent lower case. M must be 'u' or 'U' to represent the upper case.
	
	Boundary Condition(s):
	1 <= N <= 26
	5 <= Length of S <= 1000
	
	Input Format:
	The first line contains S.
	The second line contains N.
	The third line contains the character M.
	
	Output Format:
	The first line contains the count of the alphabet A in the string S.
	
	Example Input/ Output 1:
	Input:
	apple Animal Orange
	1
	u
	
	Output:
	1
	
	Explanation:
	The integer 1 represents 'a' or 'A'.
	The character M is 'u' which represents the upper case.
	The count of 'A' in the given string S is 1.
	So 1 is printed as the output. 
	
	Example Input/ Output 2:
	Input:
	GOOD PROGRAMMER
	5
	L
	
	Output:
	-1
	
	Explanation:
	The integer 5 represents 'e' or 'E'.
	The character M is 'L' which represents the lower case.
	The count of  'e' in the given string S is 0.
	So -1 is printed as the output. 
 */
public class CaseSensitiveCharCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string S, alpha index, U/L: ");
		String str = sc.nextLine();
		int alpha = sc.nextInt();
		char ch = sc.next().toUpperCase().charAt(0);
		char toFind = (ch=='U') ? (char)(64+alpha) : (char)(96+alpha);
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==toFind) {
				count++;
			}
		}
		System.out.println(count>0 ? count : "-1");
		sc.close();
	}
}
