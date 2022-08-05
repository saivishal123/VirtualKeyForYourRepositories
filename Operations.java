
import java.io.IOException;
import java.util.Scanner;

public class Operations
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("\tWELCOME TO VIRTUAL KEY ASSESMENT!!");
		System.out.println("\t\tCREATED BY – N Sai Vishal");
		System.out.println();
		Addingafile aa = new Addingafile();
		Displayafile bb= new Displayafile();
		Searchfile cc = new Searchfile();
		Deletefile dd = new Deletefile();
		Scanner sc = new Scanner(System.in);
		
		exit : while(true) 
		{
			
			System.out.println("File Operations");
			System.out.println("Enter the choice you want \n  1. Display the files  \n  2 .File Operations \n  3. To Exit");
			int choice = sc.nextInt();
			switch(choice) 
			{
			case 1 :
				bb.displayallfiles();
				System.out.println("----------------------");
				break;
			case 2 :
				while(true) 
				{	
					System.out.println("File Access");
					System.out.println("  1. Adding a File  \n  2. Searching a file  \n  3. Deleting a file  \n  4. Back to menu  \n" );
					int option = sc.nextInt();
					switch(option) 
					{
					case 1 :
						aa.createfile();
						break;
					case 2 :
						cc.searchingafile();
						break;
					case 3 :
						dd.deletingafile();
						break;
					case 4 :
						continue exit;
					default :
						System.out.println("enter your option correctly");
					}
					
				}
			case 3 :
				System.exit(0);
			default :
				System.out.println("Enter your option again");
			}
		}
	}
}