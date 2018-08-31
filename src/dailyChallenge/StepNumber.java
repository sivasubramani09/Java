package dailyChallenge;

/*
 * The following program prints "Yes" if the given number is Step Number
 * and  "No" if the given number is not a Step Number.
 * Step Number 
 * Eg: 
 * Input 12345
 * 1-2= 1; 2-3 = 1; 3-4 = 1; 4-5 = 1;
 * 
 * if the difference between each consecutive number is one, then the number is called a Step Number.
 * 
 */
import java.util.Scanner;
public class StepNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int step = sc.nextInt();
		convertInt2Array(step);
		sc.close();
		}
	
	public static void convertInt2Array(int num) {
		String temp1 = Integer.toString(num);
		String temp2;
		int temp3;
		int flag = 0;
		int [] array = new int[temp1.length()];
		for(int i=0; i<temp1.length(); i++) {
			if(i!=temp1.length()) {
				temp2 = temp1.substring(i, i+1);		
			}
			else {
				temp2 = temp1.substring(i);
			}
			temp3 = Integer.parseInt(temp2);
			array[i] = temp3;
		}
		int arrayLength = array.length;
		for(int j=0; j<arrayLength; j++) {
			if(j==(arrayLength-1)) {
				continue;
			}
			else {
			int b = array[j + 1 ] - array[j] ;
			if(b!=1) {
				flag = 1;
			}
			}
		}
		if(flag == 0) {
			System.out.println("Yes"); // The Given number is a Step Number
		}
		else {
			System.out.println("No"); // The Given number is not a Step Number
		}
	}

}
