import java.util.Scanner;

/*	Inverted V Pattern
	
	The program must accept the values of string S1 and S2 as input.
	The program must print the desired pattern as shown in the Example Input/Output section.
	
	Boundary Condition(s):
	2 <= Length of S1, S2 <= 100
	
	Input Format:
	The first line contains the value of string S1.
	The second line contains the value of string S2.
	
	Output Format:
	The list of lines contain the desired pattern as shown in the Example Input/Output section.
	
	Example Input/Output 1:
	Input:
	orange
	energy 
	
	Output:
	-----e
	----g-n
	---n---e
	--a-----r
	-r-------g
	o---------y
	
	Example Input/Output 2:
	Input:
	apple
	orange
	
	Output:
	-1
	
	Example Input/Output 3:
	Input:
	neuro 
	lemon
	
	Output:
	----n
	---o-e
	--m---u
	-e-----r
	l-------o
*/
public class InvertedVPattern {
	public static void main(String[] args) {
		System.out.println("Enter two strings:");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		String front = "";
		String back = "";
		int n=1;
		String dash="";
		boolean isTrue = true;
		sc.close();
		if(s1.length()==s2.length()) {
			if(s2.startsWith(s1.substring(s1.length()-1))) {
				front = s1;
				back = s2;
			}
			else if(s1.startsWith(s2.substring(s2.length()-1))) {
				front = s2;
				back = s1;
			}
			else {
				isTrue = false;
			}
		}
		else {
			isTrue = false;
		}
		if(isTrue) {
			for(int i=front.length()-1;i>=0;i--) {
				//(char at i) from "front" string is printed
				for(int j=i;j>=0;j--) {
					if(j>0)
						System.out.print("-");
					if(j==0)
						System.out.print(front.charAt(i));
				}
				//for printing dash
				if(i<front.length()-1) {
					dash = new String(new char[n]).replace("\0","-");
					n+=2;
				}
				System.out.print(dash);
				//(char at i) "back" String is printed
				if(i<front.length()-1) {
					System.out.print(back.charAt(back.length()-1-i));
				}
				System.out.println();
			}			
		}
		else {
			System.out.println("-1");
		}
	}
}
