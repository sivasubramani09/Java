package dailyChallenge;

import java.util.Scanner;

public class VowelWordTermination {
	public static void main(String[] args) {
		System.out.println("Enter a String:");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		sc.close();
		for(int i=n-1;i<str.length();i++) {
			char ch= str.toUpperCase().charAt(i);
			if(ch =='A'||ch=='E'|| ch=='I'||ch=='O'||ch=='U') {
				System.out.println(ch);
				System.out.println("-----"+str.substring(0, i+1));
			}
		}
	}

}
