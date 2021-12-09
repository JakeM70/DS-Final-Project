package view_SubmitListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

import Listeners.ClickListener3;
import model.Crop;
import model.CropComparator;
import model.Main;




/**
 * @author jakem - jrmeyer4
 * CIS175 - Fall 2021
 * Dec 7, 2021
 */
//Does the same thing as CornSubmitListener
public class SoybeanSubmitListener implements ActionListener{
	static PriorityQueue<Crop> sbq = new PriorityQueue<Crop>(new CropComparator());
	static List<Crop> soybeanList = new ArrayList<Crop>();
	
	@Override
	public void actionPerformed(ActionEvent e) {
		 Crop soybean = new Crop();
		 Main crop = new Main();
			
			soybean.setYeild(ClickListener3.getSoybeanYield()) ;
			soybean.setAmtPerBushel(ClickListener3.getSoybeanBushelAmt());
			soybean.setYear(ClickListener3.getSoybeanYear());
			soybean.setPlantName(ClickListener3.getPlantName());
			
			soybeanList.add(soybean);
			crop.IntoCropList(soybean);
			sbq.add(soybean);
		
	}
	
	public static PriorityQueue<Crop> soybeanq() {
		return sbq;
	
}
}
