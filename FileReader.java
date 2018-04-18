package assignment;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class FileReader
{
		double count = 0,countBuffer=0,countLine=0;
		String lineNumber = "";
		String filePath = "C:\\Users\\Matthew Champion\\Desktop\\abusivetweets.txt";
		BufferedReader br;
		String line = "";
		
		
		//Constructor
	public FileReader(ArrayList<String> swearList2)
	{
		try 
		{
			br = new BufferedReader(new FileReader(filePath));
			try 
			{
				while((line = br.readLine()) != null)
				{
					countLine++;
					String[] words = line.split(" ");

					for (String word : words) 
					{
						for(int i=0; i<swearList2.size(); i++)
						{
							if (word.equals(swearList2.get(i)))
							{
								count++;
								countBuffer++;
							}
						}
					}
					
					if(countBuffer > 0)
					{
						countBuffer = 0;
						lineNumber += countLine + ",";
					}
				}
				
				br.close();
				
			}
			
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} 
		
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("Words searched for: ");
		System.out.println("Times found: "+count);
		System.out.println("Word found in post: "+lineNumber);
	}
	
}

