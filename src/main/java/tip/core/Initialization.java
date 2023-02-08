package tip.core;

public class Initialization {

	//These are CLASS PROPERTIES and java initialize them 🥳
	int i;               // Default 0
	float j;             // Default 0.0
	char c;              // Default 0 (space) 
	boolean b;           // Default false
	String a;            // Default NULL
	Object o;            // Default NULL
	private int[] e;     // Default NULL
	private Object[] oa; // Default NULL
	

	//Error:  The blank final field may not have been initialized. 
	static final int g;
	
	//The blank final field may not have been initialized HERE. But it is initialized in static block.
	//This is useful when you want to have a final property but you need some calcualtions to get the finall value
	static final String x;
	
	static {
		String test = "test";
		x=test.toUpperCase();
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
	}
}
