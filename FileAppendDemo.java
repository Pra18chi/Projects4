package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileAppendDemo {

	public static void main(String[] args) {
		String data= "This data is appended";
		  
		try {
			FileWriter output= new FileWriter("data2.txt",true);
			output.write(data);
			System.out.println("Data appended");
			output.close();
			
		} catch (IOException ex) {
			System.out.println("File append Error");
			
		}

	}

}
