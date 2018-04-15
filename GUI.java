package assignment;

//import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JButton;
//import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
//import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GUI extends JFrame implements ActionListener
{
	//Attributes
	JButton start, add1, search_listButton, delete, deleteAll;
	JTextField addTF, search_listF, delete_text;
	
	//ArrayList
	ArrayList<SwearWords> swearList = new ArrayList<SwearWords>();
	
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
		
		addTF = new JTextField("Enter a swear word to add to list", 32);
		search_listF = new JTextField("Enter a search word for list", 32);
		delete_text = new JTextField("Enter the word you want to delete from the list",32);
		
		
		//Add listeners to elements
		start.addActionListener(this);
		search_listButton.addActionListener(this);
		delete.addActionListener(this);
		
		//Add elements to frame
		add(addTF);
		add(add1);
		add(search_listF);
		add(search_listButton);
		add(delete_text);
		add(delete);
		add(start);
		
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event)
	{
		if (event.getSource() == start)
		{
			JOptionPane.showMessageDialog(this, "Gardahash");
		}
		
		if (event.getSource() == add1)
		{
			swearList.add(addTF.getText());
		}
		
		if (event.getSource() == search_listButton)
		{
			
		}
		
		if (event.getSource() == delete)
		{
			
		}
	}
}
