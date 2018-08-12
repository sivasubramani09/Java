package dailyChallenge;

import java.math.BigInteger;
import java.util.Scanner;
/*	Form Greater Number by Swapping
	
	An integer N and an array of M integers (representing the positions of the digits in N) are passed as the input. The program must swap the digits of N at the given positions with their adjacent digits such that the resulting number formed is greater than the original number. A digit can be swapped with the adjacent digit to its left or the adjacent digit to its right whichever leads to a greater number. If no greater number can be formed by swapping the digit at given position then the digit must not be swapped.
	
	Note: Digits must be swapped in the order of the positions given.
	
	Boundary Condition(s):
	2 <= Number of digits in N <= 100
	
	Input Format:
	The first line contains N.
	The second line contains M.
	The third line contains M integers separated by space(s).
	
	Output Format:
	The first line contains an integer with its digits swapped.
	
	Example Input/Output 1:
	Input:
	2343214
	2
	2 5
	
	Output:
	3243214
	
	Explanation:
	Swapping at position 2:
	Digit at the 2nd position of 2343214 is 3.
	3 can be swapped with either 2 (resulting in 3243214) or 4 (resulting in 2433214).
	Since 3243214 > 2433214, 3 is swapped with 2 and the number becomes 3243214.
	
	Swapping at position 5:
	Digit at the 5th position of 3243214 is 2.
	2 can be swapped with either 3 (resulting in 3242314) or 1 (resulting in 3243124).
	Since both the resulting numbers 3242314 and 3243124 are smaller than the original number, no swapping is done.
	
	Example Input/Output 2:
	Input:
	902374890234
	3
	3 6 10
	
	Output:
	920378492034
*/
public class FormGreaterNumberBySwapping200718 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of Integer:");
		String in =sc.next();
		System.out.println("Enter the length of the array:");
		int arrLen = sc.nextInt();
		int arr[] = new int[arrLen];
		System.out.println("Enter the elements of the array:");
		for(int j=0;j<arrLen;j++) {
			arr[j] = sc.nextInt();
		}
		sc.close();
		System.out.println("Original value:"+in);
		BigInteger currMax = new BigInteger(in);
		for(int i=0;i<arrLen;i++) {
			int index = arr[i];
			String str =String.valueOf(currMax);
			if(arr[i]>1) {
				String swap2left = str.substring(0, index-2)+str.substring(index-1,index)
				+str.substring(index-2,index-1)+str.substring(index);
				BigInteger t = new BigInteger(swap2left); 
				currMax = (t.max(currMax));
			}
			if(arr[i]<str.length()) {
				String swap2right = str.substring(0, index-1)+str.substring(index,index+1)
				+str.substring(index-1, index)+str.substring(index+1);
				BigInteger t = new BigInteger(swap2right); 
				currMax = (t.max(currMax));
			}
		}
		System.out.println("Result: "+currMax);
	}
}
