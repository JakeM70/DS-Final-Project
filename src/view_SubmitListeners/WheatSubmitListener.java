package view_SubmitListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

import Listeners.ClickListener2;
import model.Crop;
import model.CropComparator;
import model.Main;
/**
 * @author jakem - jrmeyer4
 * CIS175 - Fall 2021
 * Dec 6, 2021
 */
//Does the same thing as CornSubmitListener
public class WheatSubmitListener implements ActionListener{
	static PriorityQueue<Crop> wq = new PriorityQueue<Crop>(new CropComparator());
	static List<Crop> wheatList = new ArrayList<Crop>();
	
	@Override
	public void actionPerformed(ActionEvent e) {
		 Crop wheat = new Crop();
		Main crop = new Main();
			
			wheat.setYeild(ClickListener2.getWheatYield()) ;
			wheat.setAmtPerBushel(ClickListener2.getWheatBushelAmt());
			wheat.setYear(ClickListener2.getWheatYear());
			wheat.setPlantName(ClickListener2.getPlantName());
			
			wheatList.add(wheat);
			crop.IntoCropList(wheat);
			
			wq.add(wheat);
		
	}
	public static PriorityQueue<Crop> wheatq() {
		return wq;
	
}
}
