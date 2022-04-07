package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) {
		char[] data= new char[100];
		
		try {
			FileReader input= new FileReader("data2.txt");
			input.read(data);
			System.out.println("data recived from a file");
			System.out.println(data);
			input.close();
		} catch (IOException ex) {
			System.out.println("File read error");
			
		}
	}

}
