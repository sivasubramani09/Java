package dailyChallenge;
import java.util.Scanner;
/*	String Triangle Pattern
	
	Accept an integer N and a string S as input. The program must print the last N characters of each word of 
	S in the desired pattern as shown in the Example Input/Output section.
	Note: 
	Each word in S contains more than N characters.
	If there is no word to fill the pattern then use *.
	
	Boundary Condition(s):
	2 <= N <= 10
	Length of the string S is between 1 and 1000.
	
	Input Format:
	The first line contains the integer N.
	The second line contains the string S.
	
	Output Format:
	The list of lines contain the last N characters in the desired pattern.
	
	Example Input/Output 1:
	Input:
	3
	apple mango orange
	
	Output:
	ple 
	ngo nge 
	
	Example Input/Output 2:
	Input:
	2
	ask happy word letter king
	
	Output:
	sk 
	py rd 
	er ng **   
	
	Explanation:
	The last 2 characters of the first word in S is "sk".
	The first line of the output must contain one word. So, "sk" is printed.
	The last 2 characters of the second and third word are "py" and "rd". 
	The second line of the output must contain two words separated by space(s). So, "py" and "rd" printed.
	The last 2 characters of the fourth and fifth word are "er" and "ng".
	The third line of the output must contain three words separated by space(s).
	But here, there are two words only.
	So, "er" and "ng" is printed. Then, for the third word "**" is printed.

*/
public class StringTrianglePattern220718 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the line: ");
		String [] lineArr = (sc.nextLine().replaceAll("  ", " ")).split(" ");
		System.out.println("Enter the integer: ");
		int n = sc.nextInt();
		int k=0;
		boolean isEnd = false;
		String print = "";
		String star = new String(new char[n]).replace("\0", "*");
		for(int i=0;i<= lineArr.length;i++) {
			for(int j=0;j<i;j++) {
				print = lineArr.length > k ? lineArr[k].substring(lineArr[k].length()-n) : star;
				System.out.print(print+" ");
				if(k  == lineArr.length - 1)
					isEnd = true;
				k++;
			}
			if(isEnd)
				break;
			System.out.println();
		}
		sc.close();
	}
}
