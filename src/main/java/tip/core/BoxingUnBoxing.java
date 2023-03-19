package tip.core;

public class BoxingUnBoxing {
	public static void main(String[] args) {
		//The 10 is primitive (int) it is not Object and of course not Integer
		//Java gently replace and BOX this 10 with new Integer(10) 
		Integer i = 10;
		
		
		//j is Integer 10 is int. 
		//Again java gently calls j.intValue() internally. it is called UNBOXING
		Integer j = new Integer(10);
		if ( j == 10 ) {
			System.out.print("euqule");
		}
	}
}


class Adding {
	Integer add(Integer a , Integer b) {
		//unboxing when adding 
		return a + b;
		//boxing when returning
	}
}