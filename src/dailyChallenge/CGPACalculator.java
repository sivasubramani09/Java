

import java.util.Scanner;

/*
 * You can calculate yours by changing the previousCredits and creditSum
 * 
 * For calculating 6th semester CGPA.
 * */

public class CGPACalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double cgpaSum = 0;
		double cgpa = 0;
		int creditSum = 28; // Sum of Credits in this semester.
		int previousCredits = 136; 
		/*
		 * Sum of Credits up to 5th Semester,
		 * (assuming you are calculating cgpa for 6th semester.)
		 * */
		System.out.println("/*\n* This Source Code is intended to calculate the CGPA for EEE Students (Regulation 2012) KSRCE \n* \n* For calculating 6th semester CGPA.");
		System.out.println("* But, you can calulate your own by changing the values of creditSum and previousCredits.\n* */");

		System.out.println("Enter your 6th Semester \"SGPA\" :");
		float sgpa = sc.nextFloat();
		System.out.println("Enter your 5th semester \"CGPA\" : ");
		float lastCGPA = sc.nextFloat();
		sc.close();
		cgpaSum = (lastCGPA*previousCredits)+(sgpa*creditSum);
		cgpa = cgpaSum/(previousCredits+creditSum);
		System.out.println("Your SGPA is\t"+sgpa);
		System.out.println("Your CGPA is\t"+cgpa);
	}

}
