package tip.core;

public class Initialization {

	//These are CLASS FILEDS and java initialize them 🥳
	int i;               // Default 0
	float j;             // Default 0.0
	char c;              // Default 0 (space) 
	boolean b;           // Default false
	String a;            // Default NULL
	Object o;            // Default NULL
	private int[] e;     // Default NULL
	private Object[] oa; // Default NULL
	static  String f;    // Default NULL 
	
	//Things change when you make them final or static


	//Error:  The blank final field may not have been initialized. 
	static final String s;
	
	//Look below field it is static final which is not initialized ... same as above 
	//Do you think error! 😋
	//But it is not 😂 it is called "Blank Final Field"
	//The blank final field may not have been initialized HERE. But it is initialized in static block.
	//This is useful when you want to have a final property but you need some calculations to get the final value
	static final String x;
	
	//Another blank final field 😅 ... it is not in the static!
	//Look at the constructor
	final int z;
	
	static {
		String test = "test";
		x=test.toUpperCase();
	}
	
	public Initialization() {
		z=100;
		
		//if you uncomment below you will face error 😲 
		//why !!
		//the "Blank Final Field" can be initialized only once
		//z=200;
	}
		
	public void aTest() {

		//These are VARIABLES and NOT class properties
		//You may wish java initialize them too 🙏 . 
		//But no hope 😈 !!
		//Compiler will show error where ever you try to use it
		
		int p;
		//ERROR: The local variable j may not have been initialized
		System.out.println( p );
		
		for (int m = 0; m < 10; m++) {
			
			String a;
			//ERROR: The local variable j may not have been initialized
			System.out.println( a );
			
		}
		
		
		for (int m = 0; m < 10; m++) {
			//no error final variable is initialized only once 
			final String a;
			a="alireza";
			System.out.println( a );
			
		}
	}
}
