package view_SubmitListeners;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.PriorityQueue;

import model.Crop;
import model.CropComparator;

/**
 * @author jakem - jrmeyer4
 * CIS175 - Fall 2021
 * Nov 30, 2021
 */
public class CornViewListener implements ActionListener{
	 static PriorityQueue<Crop> cq1 = new PriorityQueue<Crop>(new CropComparator());
	

	@Override
	public void actionPerformed(ActionEvent e) {
		cq1 = CornSubmitListener.cornq();//gets the method that return the queue form the submitListener and adds into the new queue
		
		for(int i = 0; i<=cq1.size(); i++) {//cycles throughout the queue and outputs it
		Crop corn = cq1.poll();	
		System.out.println(corn);
		}
		System.out.println("End of corn data");
	   
		
	}

}
