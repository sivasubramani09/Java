import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number:\t");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println("The Given Number is a prime number.");
		}
		else {
			System.out.println("The Given Number is not a prime number");
		}
		
	}

}
