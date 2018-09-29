package dailyChallenge;
import java.util.Scanner;
// To find whether the given number is prime or not
public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean isPrime=true;
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				isPrime=false;
				break;
			}
		}
		System.out.println( isPrime ? "The Given Number is a prime number." : "The Given Number is not a prime number");
		sc.close();
	}

}
