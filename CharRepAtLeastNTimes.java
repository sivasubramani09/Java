/*	Characters Repeating Atleast N times
	
	The program must accept a string S and an integer N as input.
	The program must print the count of characters repeating consecutively atleast N times as the output.
	
	Boundary Condition(s):
	2 <= Length of String S <= 30
	1 <= N <= 10
	
	Input Format:
	The first line contains the value of string S.
	The second line contains the value of N.
	
	Output Format:
	The first line contains the count of consecutive occurrences of characters in S.
	
	Example Input/Output 1:
	Input:
	aabccbhhhh
	2
	
	Output:
	ach
	
	Example Input/Output 2:
	Input:
	aaaabbcccbb
	3
	
	Output:
	ac
*/
public class CharRepAtLeastNTimes {
	public static void main(String[] args) {
		String in ="abcdbcd";
		int n = 1;
		int count=1;	//initialisation
		String res="";	//result
		for(int i=0;i<in.length()-1;i++) {
			for(int j=i;j<in.length()-1;j++) {
				i=j;
				if(in.charAt(i)==in.charAt(i+1)) {
					count++;
				}else {
					break;
				}
			}
			if(count>=n) {
				count=1;
				res += String.valueOf(in.charAt(i));
			}
		}
		System.out.println(res);
	}
}