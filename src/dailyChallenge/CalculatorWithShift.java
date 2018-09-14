package dailyChallenge;
/*
	Calculator With Shift
	
	An expression consisting of two integers X and Y (as operands) and a character ch (as operator) is passed as input. Another integer shift is also passed as input to the program based on which the operations are shifted. If the shift value is 1 then the operations are shifted as per the conditions are given below.
	
	Conditions:
	+ must be considered as -
	- must be considered as +
	* must be considered as /
	/ must be considered as *
	
	If the shift value is 0 then the given expression is evaluated without any modification. The program must evaluate the expression as per the conditions and print the result as the output.
	
	Note:
	Decimal place values are not considered when dividing.
	The allowed operators are +, -, * and /.
	
	Boundary Condition(s):
	-10000 <= X, Y <= 10000
	shift value is either 0 or 1.
	
	Input Format:
	The first line contains the value of X, ch and Y without any space.
	The second line contains the value of shift.
	
	Output Format:
	The first line contains the result of the expression.
	
	Example Input/Output 1:
	Input:
	2+4
	0
	
	Output:
	6
	
	Example Input/Output 2:
	Input:
	7*2
	1
	
	Output:
	3 
 */
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
