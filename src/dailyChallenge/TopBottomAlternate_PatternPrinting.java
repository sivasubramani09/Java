package dailyChallenge;

import java.util.Arrays;
import java.util.Scanner;
/*	Top Bottom Alternate - Pattern Printing
	
	The program must accept an integer N as the input. The program must print the pattern as shown in the Example Input/Output section.
	
	Boundary Condition(s):
	2 <= N <= 20
	
	Input Format:
	The first line contains the value of N.
	
	Output Format:
	The N lines contain the pattern as shown in the Example Input/Output section.
	
	Example Input/Output 1:
	Input:
	4
	
	Output:
	1*2*3*4
	9*10*11*12
	13*14*15*16
	5*6*7*8
	
	Example Input/Output 2:
	Input:
	7
	
	Output:
	1*2*3*4*5*6*7
	15*16*17*18*19*20*21
	29*30*31*32*33*34*35
	43*44*45*46*47*48*49
	36*37*38*39*40*41*42
	22*23*24*25*26*27*28
	8*9*10*11*12*13*14
*/
public class TopBottomAlternate_PatternPrinting {
	public static void main(String[] args) {
		System.out.println("Enter the integer:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k=1;
		String str[] = new String[n];
		Arrays.fill(str, "");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				str[i] += String.valueOf(k);
				if(j<n-1)
					str[i] += "*";
				k++;
			}
		}
		int index = 0;
		int flag =0;
		int temp = n;
		for(int i=0;i<n;i++){
			if(i<n/2) {
				System.out.print(str[index]);
				index += 2;
			}
			if(i==n/2) {
				System.out.print(str[n-1]);
			}
			if(i>n/2 && n%2 == 1) {
				temp -= 2;
				System.out.print(str[temp]);
			}
			if(i>n/2 && n%2 == 0) {
				if (flag ==0) {
					temp -= 3;
					flag =1;
				}
				else if(flag == 1){
					temp -= 2;
				}
				System.out.print(str[temp]);
			}
			System.out.println();
		}
		sc.close();
	}
}
