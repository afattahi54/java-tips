package tip.core;

public class AbstractInLine {

	public static void main(String[] args) {
		
		//Implement abstract method and use it
		int i = new Calculator() {
			@Override
			int add(int a, int b) {
				return a + b;
			}
		}.add(100, 200);
	
		int j = new Calculator(  ).add(1, 2);
	}
}

abstract class Calculator {
	abstract int add(int a, int b);

	int multy(int a, int b) {
		return a * b;
	}
	int sub(int a, int b) {
		return a * b;
	}
}
