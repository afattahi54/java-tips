package tip.core;

public class Overload2 {

	public static void main(String[] args) {
		//The BaseCalculator has some adds but we have created a FastClaculator which adds floats faster.
		//Do you think which add is called !
		//The BaseCalculator.add 😁
		//The key is that other type promotion is down if no method is find. 
		//By calling o add(1,1) the java search if the class or any of its parents have add(int, int) which
		//finds it in the BaseCalculator
		new FastClaculator().add(1,1);
		
	}
}

class BaseCalculator {

	int add(int a, int b) {
		return a+b;
	}
	
	float add(float a, float b) {
		return Float.sum(a, b);
	}
}

class FastClaculator extends BaseCalculator{
	
	@Override
	float add(float a, float b) {
		return Float.sum(a, b);
	}	
	
}
