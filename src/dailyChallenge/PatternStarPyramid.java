/*
    Pattern - Star Pyramid

    Input Format

    Input contains n

    Constraints

    1 <= n <= 20

    Output Format

    Print the pattern

    Sample Input 0

    5
    Sample Output 0

            * 
          * * * 
        * * * * * 
      * * * * * * * 
    * * * * * * * * * 

*/
import java.util.Scanner;

public class PatternStarPyramid {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String space="";
        String star="";
        int spaceCount=2*(n-1);
        for(int i=0;i<n;i++){
            space=new String(new char[spaceCount]).replace('\0',' ');
            spaceCount -=2;
            if(i==0){
                star+= "*";
            }else{
                star+=" * *";
            }
            System.out.print(space+star+"\n");
        }
        sc.close();
    }
}