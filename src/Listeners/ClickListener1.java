package Listeners;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import view_SubmitListeners.CornSubmitListener;
import view_SubmitListeners.CornViewListener;




/**
 * @author jakem - jrmeyer4
 * CIS175 - Fall 2021
 * Nov 29, 2021
 */
//This is the class for the one of the actionListeners so it neeeds to implement actionListener for the button in the JFrame to do anything
//ClickListener 1-3 to do basically the same things but are just for different crops
public class ClickListener1 implements ActionListener {
 static double cornYeild;
 static double amtPerBushel;
 static int year;
 static String plantName;

 static JTextField yeildField = new JTextField(20);//these are up here since I couldn't access them from inside the method to create the JFrame
 static JTextField amtPerBushelField = new JTextField(20);
 static JTextField yearField = new JTextField(4);
 static JTextField plantNameField = new JTextField(20);

@Override
public void actionPerformed(ActionEvent e) {
	JFrame frame = new cornFrame();//creates the JFrame is what the action the button does
	
    frame.setVisible(true);
}

class cornFrame extends JFrame{

	private static final long serialVersionUID = 1L;
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 200;
	
	
	public cornFrame(){
		createCornFrame();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	public void createCornFrame(){//This JFrame is to be able to input data for a corn crop with two buttons one to submit the data
		//to which it stores it in a priority queue and the view button to which outputs the data you have for corn

		JButton button = new JButton("Submit");
		JButton viewButton = new JButton("View Corn Data");
		
		JPanel panel = new JPanel(new GridLayout(4,4));
		panel.add(new JLabel("Corn Yeild: "));
		panel.add(yeildField);
		panel.add(new JLabel("Amount Per Bushel: "));
		panel.add(amtPerBushelField);
		panel.add(new JLabel("Year: "));
		panel.add(yearField);
		panel.add(new JLabel("Plant Name: "));
		panel.add(plantNameField);
		
		JPanel panel2 = new JPanel(new GridLayout(2,2));
		panel2.add(button);
		panel2.add(viewButton);
		
		setTitle("Insert Corn crop data");
		setLayout(new BorderLayout());
		add(panel, BorderLayout.NORTH);
		add(panel2, BorderLayout.SOUTH);
		
		ActionListener listener =  new CornSubmitListener();
		ActionListener listener2 =  new CornViewListener();
		button.addActionListener(listener);
		viewButton.addActionListener(listener2);

	}

	
	
}
//these methods are for the viewListeners so they can get the data that was inputed into the textfields and put them into a crop object
public static double getCornYield() throws NumberFormatException {
try {
	cornYeild = Double.parseDouble(yeildField.getText());
} catch (NumberFormatException e) {
	e.printStackTrace();
}
	return cornYeild;
}

public static double getCornBushelAmt() throws NumberFormatException{
	try {
	amtPerBushel = Double.parseDouble(amtPerBushelField.getText());
	} catch (NumberFormatException e) {
		e.printStackTrace();
	}
	return amtPerBushel;
}
public static int getCornYear() throws NumberFormatException{
	try {
	year = Integer.parseInt(yearField.getText());
	} catch (NumberFormatException e) {
		e.printStackTrace();
	}
	return year;
}

public static String getPlantName() {
	
	plantName = plantNameField.getText();
		return plantName;
	}
}
