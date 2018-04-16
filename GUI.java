package assignment;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class GUI extends JFrame implements ActionListener
{
	//Attributes
	JButton start, add1, search_listButton, delete, deleteAll, printSwearList;
	JTextField addSwearField, search_listF, delete_text;
	
	//ArrayList
	ArrayList<String> swearList = new ArrayList<String>();
	
	GUI(String title)
	{
		super(title);
		setSize(500,500);
		setLayout(new FlowLayout());
		
		//Instantiate Objects
		start = new JButton("Start Program");
		add1 = new JButton("Add to list");
		search_listButton = new JButton("Search List");
		delete = new JButton("Delete");
		deleteAll = new JButton("Delete All");
		printSwearList = new JButton("Print swear list");
				
		addSwearField = new JTextField("Enter a swear word to add to list", 25);
		search_listF = new JTextField("Enter a search word for list", 25);
		delete_text = new JTextField("Enter the word you want to delete from the list",25);
		
		//Set button sizes
		add1.setPreferredSize(new Dimension (100,30));
		search_listButton.setPreferredSize(new Dimension (100,30));
		delete.setPreferredSize(new Dimension (100,30));
		printSwearList.setPreferredSize(new Dimension (150,30));
		start.setPreferredSize(new Dimension (150,30));
		deleteAll.setPreferredSize(new Dimension (150,30));
		
		//Add listeners to elements
		start.addActionListener(this);
		add1.addActionListener(this);
		search_listButton.addActionListener(this);
		delete.addActionListener(this);
		printSwearList.addActionListener(this);
		deleteAll.addActionListener(this);
		
		//Add elements to frame
		add(addSwearField);
		add(add1);
		add(search_listF);
		add(search_listButton);
		add(delete_text);
		add(delete);
		add(start);
		add(printSwearList);
		add(deleteAll);
		
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event)
	{
		String swear, search, deleteWord;
		
		if (event.getSource() == start)
		{
			JOptionPane.showMessageDialog(this, "Gardahash");
		}
		
		if (event.getSource() == add1)
		{
			swear = addSwearField.getText();
			swearList.add(swear);
			
			JOptionPane.showMessageDialog(this, "Word added to swear list: " + swear.toString());
		}
		
		if (event.getSource() == printSwearList)
		{
			for (int i=0; i < swearList.size(); i++)
			{
				System.out.println(swearList.get(i));
			}
		}
		
		if (event.getSource() == search_listButton)
		{
			search = search_listF.getText();
			
			if (swearList.contains(search))
			{
				System.out.println("This word is in the list");
			}
			else
			{
				System.out.println("This is NOT in the list");
			}
		}
		
		if (event.getSource() == delete)
		{
			deleteWord = delete_text.getText();
			
			for(int i=0; i<swearList.size(); i++)
			{
				if (deleteWord.contains(swearList.get(i)))
				{
					swearList.remove(i);
					JOptionPane.showMessageDialog(this, deleteWord + " has been deleted from the list");
				}
			}
		}
		
		if (event.getSource() == deleteAll)
		{
			swearList.clear();
			JOptionPane.showMessageDialog(this, "List has been cleared");
		}
	}
}
