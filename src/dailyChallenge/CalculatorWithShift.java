package dailyChallenge;

public class CalculatorWithShift {
	public static void main(String[] args) {
		String str ="6--6";
		int shift = 1;
		CalculatorWithShift cs = new CalculatorWithShift();
		cs.calc(str, shift);
	}
	public void calc(String in, int shift) {
		int index=-1;
		if(in.contains("+"))
			index = in.indexOf("+");
		if(in.contains("-"))
			index = in.indexOf("-");
		if(in.contains("*"))
			index = in.indexOf("*");
		if(in.contains("/"))
			index = in.indexOf("/");
		int x = Integer.parseInt(in.substring(0, index));
		int y = Integer.parseInt(in.substring(index+1));
		char op = in.charAt(index);
		if(shift == 1 ) {
			if(op =='+')
				op='-';
			else if(op =='-')
				op ='+';
			else if(op =='*')
				op ='/';
			else if(op =='/')
				op ='*';		
		}
		switch(op) {
			case '+': System.out.println(x+y); break;
			case '-': System.out.println(x-y); break;
			case '*': System.out.println(x*y); break;
			case '/': System.out.println(x/y); break;
		}
	}
}
