
import java.io.File;
	import java.io.IOException;
	import java.util.Scanner;

	public class Addingafile
	{
		String path="C:\\Users\\saivi\\eclipse-workspace\\VirtalkeyAssesment";
		Scanner sc=new Scanner(System.in);
		void createfile()  
		{
			System.out.println("Enter the filename to create a file..");
			String filename=sc.next();
			String filepath=path+filename;
			File f=new File(filepath);
			//create a new file
			try 
			{
				if(f.createNewFile()) 
				{
					System.out.println("File has created and added successfully");
				}
				else 
				{
					System.out.println("File is not created and exists");
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}

	}


