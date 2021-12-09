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

import view_SubmitListeners.WheatSubmitListener;
import view_SubmitListeners.WheatViewListener;



/**
 * @author jakem - jrmeyer4
 * CIS175 - Fall 2021
 * Nov 29, 2021
 */
//Does the same thing as ClickListener1
public class ClickListener2 implements ActionListener {
	static double wheatYeild;
	static double amtPerBushel;
	static int year;
	static String plantName;
	
	static JTextField yeildField = new JTextField(20);
	static JTextField amtPerBushelField = new JTextField(20);
	static JTextField yearField = new JTextField(4);
	static JTextField plantNameField = new JTextField(20);
	@Override
	public void actionPerformed(ActionEvent e) {
		JFrame frame = new wheatFrame();
		
	    frame.setVisible(true);
		
	}
	class wheatFrame extends JFrame{

		private static final long serialVersionUID = 1L;
		private static final int FRAME_WIDTH = 310;
		private static final int FRAME_HEIGHT = 200;
		
		public wheatFrame(){
			createWheatFrame();
			setSize(FRAME_WIDTH, FRAME_HEIGHT);
		}
		private void createWheatFrame(){
			JButton button = new JButton("Submit");
			JButton viewButton = new JButton("View Wheat Data");
			
			JPanel panel = new JPanel(new GridLayout(4,4));
			panel.add(new JLabel("Wheat Yeild: "));
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
			
			setTitle("Insert Wheat crop data");
			setLayout(new BorderLayout());
			add(panel, BorderLayout.NORTH);
			add(panel2, BorderLayout.SOUTH);
			
			ActionListener listener =  new WheatSubmitListener();
			ActionListener listener2 =  new WheatViewListener();
			button.addActionListener(listener);
			viewButton.addActionListener(listener2);
		}
	}
	
	public static double getWheatYield() throws NumberFormatException {
		try {
			wheatYeild = Double.parseDouble(yeildField.getText());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
			return wheatYeild;
		}

	public static double getWheatBushelAmt() throws NumberFormatException{
		try {
		amtPerBushel = Double.parseDouble(amtPerBushelField.getText());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
			return amtPerBushel;
		}
	public static int getWheatYear() throws NumberFormatException{
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
