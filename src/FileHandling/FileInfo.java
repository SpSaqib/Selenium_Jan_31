package FileHandling;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) 
	{
		
		File f=new File("E:\\File Handling\\FirstFile.txt");
		
		if(f.exists())
		{
			System.out.println("File name is : "+f.getName());
			System.out.println("File path is : "+f.getAbsolutePath());
			System.out.println("File is readable : "+f.canRead());
			System.out.println("File is writeable : "+f.canWrite());
			System.out.println("File length is: "+f.length());
			System.out.println("Delete file : "+f.delete());
		}
		else
		{
			System.out.println("File is not existed");
		}

	}

}
