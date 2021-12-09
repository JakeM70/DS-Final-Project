package view_SubmitListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.PriorityQueue;

import model.Crop;
import model.CropComparator;


/**
 * @author jakem - jrmeyer4
 * CIS175 - Fall 2021
 * Dec 6, 2021
 */
//Does the same thing as the CornViewListener
public class WheatViewListener implements ActionListener{
	static PriorityQueue<Crop> wq1 = new PriorityQueue<Crop>(new CropComparator());
	
	@Override
	public void actionPerformed(ActionEvent e) {
		wq1 = WheatSubmitListener.wheatq();
		
		for(int i = 0; i<=wq1.size(); i++) {
		Crop wheat = wq1.poll();	
		System.out.println(wheat);
		}
		System.out.println("End of wheat data");
		
	}

}
