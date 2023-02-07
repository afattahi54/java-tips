package tip.core;

public class Constructor {

	private String name;
	private int age;
	
	//I have no parameters constructor my name is Default Constructor
	public Constructor() {
		
	}

	//I have a parameter I am a Parameterized Constructor
	public Constructor(String aName) {
		this.name = aName;
	}
	
	//I am a Parameterized Constructor too. As I get more parameters I am overloading constructor 
	public Constructor(String aName, int anAge) {
		this.name = aName;
		this.age = anAge;
	}

	//You wish to copy an object! There is built-in copy in java 😭 You must write it your self
	public Constructor(Constructor c) {
		this.name = c.name;
		this.age = c.age;
	}
		
		
	//AAh! This is an error
	//Constructor can only be public, protected & private
	public final Constructor(String aName, int anAge, int a ) {
		
	}
	
	
	//Error again !!
	//Constructor can not return any thing. the constructor return type is Void
	public Constructor(String aName, int anAge, int a, int b ) {
		return this;
	}

	//Error again !!
	//Constructor can not be static. 
	//It will be funny if it was not an error. 
	//Consider you call constructor to be get new object in the way that you do not want the object
	//because is is static 
	public static Constructor(String aName, int anAge, int a, int b , int c ) {
	}
	
	public static void main(String[] args) {
		Constructor person1 = new Constructor();
		Constructor person2 = new Constructor("alireza");
		Constructor person3 = new Constructor("arefeh",45);
		
		Constructor person4 = new Constructor( person3 );
	}
	
	
}
