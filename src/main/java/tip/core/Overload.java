package tip.core;

public class Overload {

	public static void main(String[] args) {
		//ambiguity 🤔 which add should be called
		Adder.add(1,1);
		
		//ambiguity 🤔 which add should be called
		Multipler.mult(1, 1);
	}
}

class Adder {
	// ERROR!
	// you can not overload by changing the return type
	static int add(int a, int b) {
		return a + b;
	}

	static double add(int a, int b) {
		return a + b;
	}
}


class Multipler {
	// ERROR!
	// you can not overload by changing a method static
	static int mult(int a, int b) {
		return a + b;
	}

	int mult(int a, int b) {
		return a + b;
	}
}