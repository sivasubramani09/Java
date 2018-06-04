
import java.util.Scanner;

public class CheckCase {
	public static void main(String[] args) {
		String value;
		char[] ch;
		int len;
		int up = 0;
		int low = 0;
		Scanner sc = new Scanner(System.in);
		value = sc.nextLine();
		len = value.length();
		ch = value.toCharArray();
		sc.close();
		for(int i = 0; i<len; i++) {
			char output = ch[i];
			if(Character.isUpperCase(output)) {
				up++;
			}
		    if(Character.isLowerCase(output)) {
				low++;
			}
		}
		System.out.println(up);
		System.out.println(low);
	}
}
