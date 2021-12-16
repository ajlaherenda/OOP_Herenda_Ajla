package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Analysis {
private File file;
private Scanner reader=null;
	public Analysis(File file)
	{
		this.file=file;
	}
	public int lines()
	{     try {
        this.reader = new Scanner(this.file);
        int i=0; 
  
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            i++;
        }

        reader.close();
        return i;
    } catch (Exception e) {
        System.out.println("We couldn't read the file. Error: " + e.getMessage());
        return 0;
    }
	}
	public int characters()
	{   try {
		int i=0;
		this.reader=new Scanner(this.file);
		while(reader.hasNextLine())
		{   String line=reader.nextLine();
			i=i+line.length();
		}
		reader.close();
		return i;
	} catch(Exception e)
	{
		System.out.println("We couldn't read the file. Error: "+e.getMessage());
		return 0;
	}
		
	}
	
}
