import java.util.* ;
import java.io.*;
import javax.swing.*;
class Word 
{
	String name ;
	String meaning ;
	
	public Word(String name )
	{
		this.name = name ;
		this.meaning = meaning ;
	}
	
	String getname()
	{
		return name ; 
	}
	String getmeaning()
	{
		return meaning ;
	}
	void setname(String name) 
	{
		this.name = name ;
	}
	void setmeaning(String meaning) 
	{
		this.meaning = meaning;
	}
	public void display()
	{
		System.out.println("Word is: "+ name +" and meaning of that word is: " + meaning);
	}
}
class Dictionary
{
	HashMap<String, String> map;
	
	
	public Dictionary()
	{
		map = new HashMap<String, String>();
	}
	
	void InsertRecord ()
	{
		Scanner in = new Scanner(System.in);
		String name , meaning;
		System.out.println("Enter Word Name : ");
		name = in.nextLine();
		System.out.println("Enter Meaning  : " );
		meaning =  in.nextLine();
		System.out.println("Word of Meaning have Stored");
		map.put(name, meaning);
	}
	void findRecord ()
	{
		String name;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The Word u want to Search for Meaning " ) ;
		name = in.nextLine();
		String mean =  map.get(name) ;
		if(mean == null)
		{
			System.out.println("Word Doesnt Exist in Hashmap ");
		}
		else 
		{
			System.out.println("Meaning of this word is : " + mean);
		}
	}	
}
	
public class Driver{
		public static void main(String args[])
		
		{
			Dictionary d = new Dictionary();
			
			String input, s;
			
			int ch;
			
			while(true)
				
			{
				input = JOptionPane.showInputDialog("1.Insert Word & Meaning\n" + "2.Find Meaning by Word\n" + "3.Exit" );
				
				ch = Integer.parseInt(input);
				
				switch(ch)
				{
				case 1:
				
					d.InsertRecord();
					break;
				
				case 2:
				
					d.findRecord();
					break;
				
				case 3:
				    System.exit(0);
				}
			}
	}
}