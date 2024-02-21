package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		
		//Creating a file
		File f=new File("E:\\File Handling\\FirstFile.txt");
		
		if(f.createNewFile())
		{
			System.out.println("new File is created");
		}
		else
		{
			System.out.println("File is already created");
		}

	}

}
