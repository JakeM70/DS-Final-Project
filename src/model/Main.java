package model;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Listeners.ClickListener1;
import Listeners.ClickListener2;
import Listeners.ClickListener3;
import Listeners.ClickListener4;

/**
 * @author jakem - jrmeyer4
 * CIS175 - Fall 2021
 * Nov 29, 2021
 */

//The main window that pops up when you run the program
//Creats the main menu to choose to add which crop you want or to see all the ones that you have inputed

public class Main {
	static List<Crop> CropsSort = new ArrayList<Crop>();
	
	public void IntoCropList(Crop crops) {//method to add crop objects into a list
		CropsSort.add(crops);
	}
	public static List<Crop> cropsList() {//returns the list used in the clickListener4 class
		return CropsSort;
	
}
	
	static class cropFrame1 extends JFrame{
		
		private static final long serialVersionUID = 1L;

		private static final int FRAME_WIDTH = 350;

		   private static final int FRAME_HEIGHT = 100;

		
		public cropFrame1() {
			createFrame1();
			setSize(FRAME_WIDTH, FRAME_HEIGHT);
		}
		private void createFrame1() {
			 JPanel panel = new JPanel();
			 JButton button1 = new JButton("Corn");
		     JButton button2 = new JButton("Wheat");
		     JButton button3 = new JButton("SoyBean");
		     JButton button4 = new JButton("View All Crop Data");
		     panel.add(button1);
		     panel.add(button2);
		     panel.add(button3);
		     panel.add(button4);
		     setTitle("Choose crop to insert data for");
		     add(panel);
		     
		     //All buttons have actionlisteners that lead to a separate class
		     ActionListener listener =  new ClickListener1();//1 through 3 basically do the same thing but 4 is the one that shows all the data you have inputed
		     ActionListener listener2 = new ClickListener2();
		     ActionListener listener3 = new ClickListener3();
		     ActionListener listener4 = new ClickListener4();
		     button1.addActionListener(listener);
		     button2.addActionListener(listener2);
		     button3.addActionListener(listener3);
		     button4.addActionListener(listener4);
		}
	}
	
	public static void main(String[] args) {
		 JFrame frame = new cropFrame1();
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     frame.setVisible(true);
		      
	}

}

