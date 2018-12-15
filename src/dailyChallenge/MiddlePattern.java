package dailyChallenge;
/*
Input: PROGRAM                            Input: RAT
Output:                                   Output:
            G                                       A
          GR                                      AT  
        GRA                                     ATR
      GRAM
    GRAMP
  GRAMPR
GRAMPRO

 * */
public class MiddlePattern {
	public static void main(String[] args) {
		String s = "VAPDYEFNWCE";
		int pos = s.length()/2;
		String print = new String();
		int spaceCount = s.length()*2 - 2;
		for(int i=0;i<s.length();i++) {
			for (int j = 0; j < spaceCount; j++) {
				System.out.print(" ");
			}
			if((pos+1) >s.length()) {
				pos = pos - s.length();
			}
			print += s.substring(pos,pos+1);
			System.out.print(print+"$");
			pos++;
			spaceCount -= 2;
		}
	}
}
