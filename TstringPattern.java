/*	T String Pattern
	
	Given two strings S1 and S2, the program must print the pattern as shown in the Example Input/Output section.
	
	Note:
	The string S1 always comes in the first row.
	The string S2 is printed along the last matching column of S1.
	
	Boundary Condition(s):
	1 <= Length of S1, S2 <= 100
	
	Input Format:
	The first line contains S1.
	The second line contains S2.
	
	Output Format:
	The pattern is printed as shown in the Example Input/Output section.
	
	Example Input/Output 1:
	Input:
	trophy
	panther
	
	Output:
	trophy
	---a--
	---n--
	---t--
	---h--
	---e--
	---r--
	
	Example Input/Output 2:
	Input:
	morning
	ninja
	
	Output:
	morning
	-----i-
	-----n-
	-----j-
	-----a-
*/
public class TstringPattern {
	public static void main(String[] args) {
		String str1 = "trophy";
		String str2 = "panther";
		int findIndex = str1.lastIndexOf(str2.charAt(0));
		//System.out.println("Last Index:"+findIndex);
		System.out.println(str1);
		for(int i=1;i<str2.length();i++) {
			for(int j=0;j<str1.length();j++){
				if(j!=findIndex) {
					System.out.print("-");
				}else {
					System.out.print(str2.charAt(i));
				}
			}
			System.out.println();
		}
	}
}
