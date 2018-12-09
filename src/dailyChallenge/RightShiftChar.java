package dailyChallenge;
/*
 Input:
 my  name is   issac
 Output:
 cm  ynam ei   sissa
  
 */

public class RightShiftChar {
	public static void main(String[] args) {
		String input="my  name is   issac";
		char[] in = input.toCharArray();
		char[] out = new char[in.length];
		int spaceCount=0;
		for(int i=0;i<in.length;i++) {
			if(i==0) {
				out[0]=in[in.length-1];
			}
			else if(in[i]==' ') {
				out[i]=' ';
			}
			else {
				if(in[i-1]==' ') {
					for(int j=i-1;j>=0;j--) {
						if(in[j]==' ') {
							spaceCount++;
						}
						else {
							out[i]=in[i-spaceCount-1];
							spaceCount=0;
							break;
						}
					}
				}else {					
					out[i]=in[i-spaceCount-1];
				}
			}
		}
		for(int i=0;i<out.length;i++) {
			System.out.print(out[i]);
		}
	}
}
