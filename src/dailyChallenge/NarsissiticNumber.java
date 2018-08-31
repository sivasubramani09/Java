package dailyChallenge;

import java.util.Scanner;
/*
* An n-digit number that is the sum of the nth powers of its digits
* is called an n-narcissistic number.
*/

public class NarsissiticNumber {
	public static void main(String args[]) {
	int temp;
	int digit;
	int sum = 0;
	//System.out.print("Enter the number:");
	Scanner sc = new Scanner(System.in);
	String numString = sc.next();
	sc.close();
	int len = numString.length();
	int num = Integer.parseInt(numString);
	//The while() loop is used to calculate the power and sum of the given number. 
	temp = num;
	while(temp != 0) {
		digit = temp % 10;
		temp /= 10;
		int mul = 1;
		for(int i=0; i<len; i++) {
		mul *= digit;
		}
		sum += mul;
	}

	if(sum == num) {
		System.out.println("True");
	}
	else {
		System.out.println("False");
	}
}

}

//Completed on 02 June 2018
