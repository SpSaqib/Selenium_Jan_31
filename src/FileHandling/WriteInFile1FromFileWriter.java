package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile1FromFileWriter {

	public static void main(String[] args)  {
		
		try
		{
		FileWriter f=new FileWriter("E:\\File Handling\\Write In File.txt");
		
			try
			{
				f.write("Java is the best language");
			}
			finally
			{
				f.close();
			}
			System.out.println("File is wrote successfully");
			
		}
		
		catch(IOException i)
		{
			System.out.println("Exception occured............");
		}
		

	}

}
