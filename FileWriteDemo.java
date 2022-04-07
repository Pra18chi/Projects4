package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {

	public static void main(String[] args) {
		String data="102,Shubh,Rudrapryag,Uttarakhand,India";
	try{
		FileWriter output = new FileWriter("data2.txt");
		output.write(data);
		System.out.println("data is written successfully");
		output.close();
	} catch (IOException ex) {
		System.out.println("file write error");
	}
		

	}

}
