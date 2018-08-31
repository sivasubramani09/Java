import java.util.Scanner;
/*
 * Author: @Sivasubramani_D
 *I created this to find my 6th semester SGPA and CGPA. But this code can be used for any semester by changing previousCredits.
 *This source code is intended to calculate SGPA and CGPA, assuming you don't have any arrears.
 *Grading system is for KSRCE(Autonomous) (Regulation 2012)
 */
public class GradeCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the No. of Subjects:");
		int noOfSubjects = sc.nextInt();
		int arrearCount = 0;
		int credit[] = new int[noOfSubjects];
		int gradePoint[] = new int[noOfSubjects];
		int result[] = new int [noOfSubjects];
		double resultSum=0;
		double creditSum=0;
		System.out.println("Enter the credits and grade point for each subject (Seperated by space):");
		System.out.println("Credits:\tGrade points:\n");
		for(int i=0; i<noOfSubjects; i++) {
			credit[i]=sc.nextInt();
			char ch = sc.next().charAt(0);
			switch(ch) {
			case 'S':
			case 's' : gradePoint[i] = 10; break;
			case 'A':
			case 'a' : gradePoint[i] = 9; break;
			case 'B':
			case 'b' : gradePoint[i] = 8; break;
			case 'C':
			case 'c' : gradePoint[i] = 7; break;
			case 'D':
			case 'd' : gradePoint[i] = 6; break;
			case 'E': 
			case 'e' : gradePoint[i] = 5; break;
			case 'U':
			case 'u' : gradePoint[i] = 4; break;
			}
			result[i] = credit[i]*gradePoint[i];
			resultSum += result[i];
			creditSum += credit[i];
			if(gradePoint[i]<5) {
				arrearCount++;
			} 
		}
		//SGPA
		double sgpa = resultSum/creditSum;
		System.out.println("For verification,..\n");
		System.out.println("Subject No--->\t"+"Credits * Grade point\n");
		for(int i=0; i<noOfSubjects; i++) {
			System.out.println("Subject "+(i+1)+" --->\t"+credit[i]+" * "+gradePoint[i]+" = "+(credit[i]*gradePoint[i]));
			}
		if(arrearCount>0) {
			System.out.println("No. of arrears: "+arrearCount);
		}
		System.out.println("\nSGPA:\t"+sgpa);
		//CGPA
		char ch = ' ';
		double cgpaSum = 0;
		double cgpa = 0;
		int previousCredits = 136; //Credits upto 5th Semester "for my department"
		System.out.println("Do you want to calculate your CGPA: (Y/N) ");
		ch=sc.next().charAt(0);
		if(ch==('y'|'Y')) {
			System.out.println("Enter your 5th semester CGPA: ");
			float previousCGPA = sc.nextFloat();
			cgpaSum = (previousCGPA*previousCredits)+(sgpa*creditSum);
			cgpa = cgpaSum/(previousCredits+creditSum);
			System.out.println("Your SGPA is\t"+sgpa);
			System.out.println("Your CGPA is\t"+cgpa);
		}
		sc.close();		
	}
}
