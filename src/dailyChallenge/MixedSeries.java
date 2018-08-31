package dailyChallenge;

import java.util.Scanner;
/*
	TCS Ninja Mock Test
	Fibonacci Series: 1 1 2 3 5 8 13 21
	Prime Number Series: 2 3 5 7 11 13 17
	Mixed Series: 1 2 1 3 2 5 3 7 5 11 8 13 13 17 21 
	
	if the given input is 14, the output should be 17 //(14 th term in the mixed series)
*/
public class MixedSeries {
	final int MAX = 100;
	final int NIL = -1;
	int lookup[] = new int[MAX];
	public static void main(String[] args) {
		System.out.println("Enter the value of N: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		MixedSeries ms = new MixedSeries();
		ms._initialize();
		System.out.print("the number "+n+" at the series is: ");
		if((n-1)%2 == 0) {
			System.out.println(ms.fib((n/2)+1));
		}else {
			System.out.println(ms.nthPrime(n/2));
		}
		sc.close();
	}
 
	/* Function to initialize NIL values in lookup table */
	void _initialize()
	{
		for (int i = 0; i < MAX; i++)
			lookup[i] = NIL;
	}
	
	/* function for nth Fibonacci number */
	int fib(int n)
	{
		if (lookup[n] == NIL)
		{
			if (n <= 1)
				lookup[n] = n;
			else
				lookup[n] = fib(n-1) + fib(n-2);
		}
		return lookup[n];
	}
	boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	int nthPrime(int n) {
		int count = 0;
		int prime =0;
		int i;
		for(i=2;count<n;i++) {
			if(isPrime(i)) {
				count++;
				prime = i;
			}
		}
		return prime;
	}
}
