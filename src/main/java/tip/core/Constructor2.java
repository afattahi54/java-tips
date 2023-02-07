package tip.core;

public class Constructor2 {

	Constructor2(int a, int b) {
		System.out.println("a = " + a + " b = " + b);
	}

	Constructor2(int a, float b) {
		System.out.println("a = " + a + " b = " + b);
	}

	public static void main(String args[]) {
		byte a = 10;
		byte b = 15;
		//a and b are "byte" the Constructor accepts int,int or int,float 😭
		//will java show errors !! NO 🥳🥳 
		//Java gently promote variables (called "Type Promotion" )
		//From a  byte  to a  short, an int, a long, a float, or a double
		//From a  short to an int, a long, a float, or a double
		//From a  char  to an int, a long, a float, or a double
		//From an int   to a  long, a float, or a double
		//From a  long  to a  float or a double
		//From a  float to a  double
		Constructor2 test = new Constructor2(a, b);
		
		//Hey this class has a parameterized constructor.
		//Do you think java still produce that default constructor for you !!
		//You are wrong 😏
		//The below line shows error. 🙄😕
		Constructor2 test2 = new Constructor2();
	}
}
