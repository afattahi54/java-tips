package tip.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CatchExceptionAndExceptionParent {

	public static void main(String[] args) {
						
		try {
			//FileNotFoundException extends IOException. 
			//The compiler just show warning:
			//Unreachable catch block for IOException. 
			//Only more specific exceptions are thrown and they are handled by previous catch block(s).
			FileReader aFile = new FileReader("foo.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			//Lets just change the order of catches
			//FileNotFoundException extends IOException. 
			//The compiler shows error:
			//Unreachable catch block for FileNotFoundException. 
			//It is already handled by the catch block for IOException 
			FileReader aFileReader = new FileReader("foo.txt");			
		} catch (IOException e) {
			e.printStackTrace();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
