package tip.core;

public class This {

	public void aMethod() {
		
		//Error!! you can not set this to null
		this = null;
		//Error!! you can not set it to anything
		this = new This();
	}
}
