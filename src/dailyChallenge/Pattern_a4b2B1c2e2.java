package dailyChallenge;

public class Pattern_a4b2B1c2e2 {
	public static void main(String[] args) {
		String str = "aaaabbBccee";  //output : a4b2B1c2e2
		int count =1;
		String res="";
		char ch='\u0000';
		for(int i=0;i<str.length();i++) {
			for (int j = i; j < str.length()-1; j++) {
				i=j;
				ch = str.charAt(j);
				if(str.charAt(j)==str.charAt(j+1)) {
					count++;
				}else {
					break;
				}
			}
			res += String.valueOf(ch)+String.valueOf(count);
			count=1;
		}
		System.out.println(res.substring(0,res.length()-2));
	}
}
