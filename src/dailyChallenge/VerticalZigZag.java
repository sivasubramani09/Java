package dailyChallenge;

/*
 * The input is number of rows and columns;
 * Ex: 5 5
 * The output should pattern should be like this.
 * 1 12 13 24 25 36 
 * 2 11 14 23 26 35 
 * 3 10 15 22 27 34 
 * 4 9 16 21 28 33 
 * 5 8 17 20 29 32 
 * 6 7 18 19 30 31 
 * */
public class VerticalZigZag {
	public static void main(String[] args) {
		int x=10; // No. of Rows
		int y=10; // No. of Columns
		int diff1 = x*2 -1;
		int diff2 = 1;
		for(int i=1;i<=x;i++) {
			int jValue=i;
			for(int j=1;j<=y;) {
				System.out.print(jValue+" ");
				j++;
				if(j%2 == 0) {
					jValue=jValue+diff1;
				}else {
					jValue=jValue+diff2;
				}				
			}
			diff1 = diff1-2;
			diff2 = diff2+2;
			System.out.println();
		}
	}
}
