package dailyChallenge;

import java.util.Scanner;

/*
	Count of Longest Consecutive 1's
	
	The program must accept an integer N as the input. The program must print the count of longest consecutive 1's in the binary representation of N as the output.
	
	Boundary Condition(s):
	1 <= N <= 99999999
	
	Input Format:
	The first line contains the integer value of N.
	
	Output Format:
	The first line contains the count of longest consecutive 1's in the binary representation of N.
	
	Example Input/Output 1:
	Input:
	55
	
	Output:
	3
	
	Explanation:
	The binary representation of 55 is 110111.
	The first two bits and the last three bits are consecutive 1's.
	The count of the longest consecutive 1's is 3.
	Hence, 3 is printed as the output.
	
	Example Input/Output 2:
	Input:
	1468
	
	Output:
	4
 */
public class CountOfLongestConsecutive1s {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String binVal = Integer.toBinaryString(sc.nextInt());
		int count =0;
		int maxCount=0;
		for(int i=0;i<binVal.length();i++) {
			for(int j=i;j<binVal.length()-1;j++) {
				i=j;
				if(binVal.charAt(j)== '1' && binVal.charAt(j+1)=='1') {
					count++;
				}else {
					break;
				}
			}
			maxCount = count>maxCount ? count : maxCount;
			count =0;
		}
		System.out.println(maxCount>0 ? maxCount+1 : 0);
		sc.close();
	}
}
