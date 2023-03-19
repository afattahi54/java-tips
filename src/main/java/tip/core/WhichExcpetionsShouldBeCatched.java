package tip.core;

import java.io.FileReader;
import java.util.Iterator;

public class WhichExcpetionsShouldBeCatched {
	public static void main(String[] args) {
		//All Throwable exceptions showed be cached. 
		//But there are two group of exceptions which you can ignore them
		//1- All exceptions that extend RuntimeException (java.lang.RuntimeException)
		//2- All exceptions that extend Error (java.lang.Error)
		//
		//Of course you do not ignore them. Compiler ignores. 
		//So compiler will not check these exceptions and will not force you to cache them
		//Because of this all RuntimeException and  Error are called UNCHECKED
		//All other exceptions are CHECKED
		
		
		//FileReader throws FileNotFoundException which is checked. Compiler error here
		FileReader f = new FileReader("ss");
		
		int arrayOfInt[] = {1,2,3,4};
		for (int j = 0; j < 10; j++) {
			try {
				System.out.println("I am reading :" + arrayOfInt[j]);
			//If you remove ArrayIndexOutOfBoundsException the program will still compile
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Error! Reading array of index : '" + j + "', While array size is "+ arrayOfInt.length);
			}
		}
		
			
		}
		
}

