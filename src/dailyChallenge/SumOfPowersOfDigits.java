package dailyChallenge;
/*
 	Input:
 	123456
 	Output:
 	7842
 	Explanation:
 	6^5 + 4^3 + 2^1 = 7776+64+2 = 7842
 */
public class SumOfPowersOfDigits {
	public static void main(String[] args) {
		int n=123456;
		int first = 0;
		int second = 0;
		int sum=0;
		while (n>0) {
			first = n % 10;
			if((n/10)>0) {
				n /= 10;
				second = n%10;				
			}else {
				second = 1;
			}
			n /= 10;
			sum += findPower(first,second);
		}
		
		System.out.println(sum);
	}
	public static int findPower(int a, int b) {
		if(b==0)
			return 1;
		else
			return a * findPower(a,b-1);
	}
}
