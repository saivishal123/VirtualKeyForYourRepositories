
import java.io.File;
import java.util.Arrays;

public class Displayafile

{
	void displayallfiles()
	{
		String path="C:\\Users\\saivi\\eclipse-workspace\\VirtalkeyAssesment";
		File f=new File(path);
		//display operation
		File filenames[]=f.listFiles();
		Arrays.sort(filenames);
		System.out.println("The List of Files are: \n");
		for(File ff:filenames) {
			System.out.println(ff.getName());
		}
	}
}

