package fileHandling;
import java.io.File;
import java.io.IOException;
public class CreateFile{
	public static void main(String[] args){
		File myFile = new File("data2.txt");
		
		try {
			if (myFile.createNewFile()){
			System.out.println("file created successfully");
}
else {
			System.out.println("file not created");
}
		} catch (IOException e) {
			System.out.println("File error");
		}

	}
}
	

