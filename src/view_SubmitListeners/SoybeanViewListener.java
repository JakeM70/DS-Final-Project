package view_SubmitListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.PriorityQueue;

import model.Crop;
import model.CropComparator;




/**
 * @author jakem - jrmeyer4
 * CIS175 - Fall 2021
 * Dec 7, 2021
 */
//Does the same thing as CornViewListener
public class SoybeanViewListener implements ActionListener{
	static PriorityQueue<Crop> sbq1 = new PriorityQueue<Crop>(new CropComparator());
	@Override
	public void actionPerformed(ActionEvent e) {
		sbq1 = SoybeanSubmitListener.soybeanq();
		
		for(int i = 0; i<=sbq1.size(); i++) {
			Crop soybean = sbq1.poll();	
			System.out.println(soybean);
		}
		System.out.println("End of soybean data");
		
		
	}

}
