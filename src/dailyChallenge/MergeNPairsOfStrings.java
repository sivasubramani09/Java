package dailyChallenge;
/*
 	Merge N Pairs of String

	The program must accept an integer N and N pairs of strings. Then the program must merge every pair of strings and print the merged string.
	
	Boundary Condition(s):
	2 <= N <= 100
	1 <= Length of String <= 1000
	
	Input Format:
	The first line contains N.
	The next N lines contain two strings each.
	
	Output Format:
	The first N lines contain the merged strings.
	
	Example Input/Output 1:
	Input:
	2
	good bye
	take care
	
	Output:
	gboyoed
	tcaakree
	
	Example Input/Output 2:
	Input:
	3
	cool buddy
	think well
	welcome tin
	
	Output:
	cbouodldy
	twheilnlk
	wteilncome
 */

public class MergeNPairsOfStrings {
	public static void main(String[] args) {
		String srr[]  = {"good bye","take care","cool buddy","think well","welcome tin"};
		int n = srr.length;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++) {
			String str[] = srr[i].split(" ");
			int max = str[0].length()>str[1].length() ? str[0].length() :str[1].length();
			for(int j=0;j<max;j++) {
				if(j<str[0].length())
				sb.append(str[0].charAt(j));
				if(j<str[1].length())
				sb.append(str[1].charAt(j));
			}
			System.out.println(sb);
			sb.delete(0, sb.toString().length());
		}
	}

}
