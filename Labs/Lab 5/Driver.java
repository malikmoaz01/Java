import java.io.*; 
class ReadFile implements Runnable{ 
	
	String filename; 
	
public ReadFile(String fn) 
	{ 
	
		filename = fn; 
	} 
	

	public void run()
	{
		try
		{
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		String line =  br.readLine();
		while(line != null) {
		System.out.println(filename + "::" + line);
		line = br.readLine();
		}
		br.close();
		fr.close();
		}catch(IOException ioEx) {
			System.out.println(ioEx);
		}
	}
}
		
public class Driver
{
	public static void main(String args[]) {
			ReadFile file1 =  new ReadFile("file1.txt");
			ReadFile file2 =  new ReadFile("file2.txt");
			Thread thread1 = new Thread(file1);
			Thread thread2 = new Thread(file2);
			thread1.start();
			thread2.start();
}
}