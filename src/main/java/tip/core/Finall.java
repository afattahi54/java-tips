package tip.core;

public class Finall {

}

final class Person {
	final int maxAge = 100;

}

//Class is final you can't extend it
class Teacher extends Person {

	@Override
	// Method is final you can't override it
	void printName(String name) {
		System.out.println(name);
	}

	void aMethod() {
		// Property is final you can't change it
		maxAge = maxAge * 2;
	}

	// Property is final you can't change it
	void printSoneThing(final String s) {
		s = "sss";
	}
}
