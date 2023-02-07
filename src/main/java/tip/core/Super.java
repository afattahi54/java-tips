package tip.core;

public class Super {
	public static void main(String args[]) {
		//What do you think will be printed ?!
		//"Student class constructor called"
		//You are wrong
		//The Student constructor "implicitly" calls its parent by super() invocation
		//In java world the childs are very respectful to their parents. if you want to make 
		//a new child, the child first creates its parents
		Student e = new Student();		
	}
}

class Teacher extends Human {
	public Teacher() {
		System.out.println("Teacher class constructor called");
	}
}

class Human {
	public Human(String name) {
		System.out.println("Human class constructor called");
	}
}


class Student extends Person {
	public Student() {
		System.out.println("Student class constructor called");
	}
}

class Person {
	public Person() {
		System.out.println("Person class constructor called");
	}
}
