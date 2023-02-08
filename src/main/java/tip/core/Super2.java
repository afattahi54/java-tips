package tip.core;

public class Super2 {
	public static void main(String args[]) {
		//What do you think will be printed ?!
		//"Student class constructor called"
		//You are wrong ?! 🙄 
		//The Student constructor "implicitly" calls its parent by super() invocation
		//In java world the child's are very respectful to their parents. if you want to make 
		//a new child, the child first creates its parents
		Teacher t = new Teacher();		
	}
}

class Teacher extends Human {
	//ERROR! 
	//error is : Must explicitly invoke another constructor !!
	//this constructor in child class wants to call its parent super() method
	//look at the parent is has a parameterized constructor, so the default (non parameter) constructor
	//not added by default 
	//You can fix it by 
	//1- adding a default constructor to Human class
	//2- class super("a string") in the first line of Teacher class
	public Teacher() {
		System.out.println("Teacher class constructor called");
	}
}

class Human {
	public Human(String name) {
		System.out.println("Human class constructor called");
	}
}
