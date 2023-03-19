package tip.core;

class Animal {
	void says(){
		System.out.println("no sound");
	}
}

class Cat extends Animal {
	void says(){
		System.out.println("mioooo");
	}
}

class Dog extends Animal {
	void says(){
		System.out.println("wooof");
	}
}

class Puppy extends Dog {
	void says(){
		System.out.println("wiiiiif");
	}
}
class RuntimePolymorphism {  
  
    public static void main(String args[]) {
    	//You cat dog to its parent, it is up-casting
    	Animal a = new Dog();
    	//You call a.says(), which says method will be called 😏
    	//You may think that the `a` is cast to Animal, so it will be animal for the rest of the program
    	//but you are wrong !
    	//The java  that the `a` was created as a `Dog` so when calling `a.says()` it up cast `a` to its actual object

    	a.says();

    	//The above is called runtime polymorphism. You know way?  at compile time you can not 100% be sure
    	//what the object is. To test it hold ctrl key and click `says` method, then click `open implementation`
    	//you see that the eclipse shows you all three classes which has `says` method 


    }  
}   
