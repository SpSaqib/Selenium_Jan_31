package FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFile1 {

	public static void main(String[] args) {
		try
		{
		FileReader f=new FileReader("E:\\File Handling\\Write In File.txt");
		
			try
			{
				int i;
				while((i=f.read())!=-1)
				{
				// i will give ascii value, have to convert ascii value to character type
					System.out.print((char)i);
				}
			}
			
			finally
			{
				f.close();
			}
			System.out.println();
			System.out.println("File is read successfully");
			
		}
		
		catch(IOException i)
		{
			System.out.println("Exception occured............");
		}

	}

}
