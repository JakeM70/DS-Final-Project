package view_SubmitListeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import java.util.List;
import java.util.PriorityQueue;

import Listeners.ClickListener1;
import model.Crop;
import model.CropComparator;
import model.Main;

/**
 * @author jakem - jrmeyer4
 * CIS175 - Fall 2021
 * Nov 30, 2021
 */
//this actionListener class is for the submit buttons inside the clickLister class 1-3 this is the same for each of the submitListener classes
public class CornSubmitListener  implements ActionListener {
	static PriorityQueue<Crop> cq = new PriorityQueue<Crop>(new CropComparator());
	static List<Crop> cornList = new ArrayList<Crop>();
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//creats objects
		 Crop corn = new Crop();
		Main crop = new Main();
		
		corn.setYeild(ClickListener1.getCornYield()) ;
		corn.setAmtPerBushel(ClickListener1.getCornBushelAmt());
		corn.setYear(ClickListener1.getCornYear());
		corn.setPlantName(ClickListener1.getPlantName());
		//adds the infor from the text fields from the clickListener classes into the crop object
		
		cornList.add(corn);//adds it to a list
		crop.IntoCropList(corn);//adds into 
		cq.add(corn);
		
	}
	
public static PriorityQueue<Crop> cornq() {//method used to return the priority queue so the viewListner class can use it
		return cq;
	
}

}
