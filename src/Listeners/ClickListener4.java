package Listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import model.Crop;
import model.Main;

/**
 * @author jakem - jrmeyer4
 * CIS175 - Fall 2021
 * Dec 7, 2021
 */
//This clickListener is a little different only thing it does is takes all the info that has been entered puts it through a selectionsort then outputs the info
public class ClickListener4 implements ActionListener{
	static List<Crop> CropList = new ArrayList<Crop>();
	@Override
	public void actionPerformed(ActionEvent e) {
		CropList = Main.cropsList();
		
		selectionSort(CropList.toArray());
		
		System.out.println("End of crop data");
	}
	//method for the selection sort
	void selectionSort(Object[] objects) {
		int n = objects.length;

	    for (int i = 0; i < n-1; i++){
	    	int min_idx = i;
	        for (int j = i+1; j < n; j++)
	            if (((Crop) objects[j]).getAmtPerBushel() > ((Crop) objects[min_idx]).getAmtPerBushel())//had to cast to crop to be able to put a crop object into the object array
	                min_idx = j;
	    
	       Crop temp = (Crop) objects[min_idx];
	        objects[min_idx] = objects[i];
	        objects[i] = temp;
	    }
	    for(int i = 0; i<objects.length; i++) {
	    	System.out.println(objects[i]);
	    }
	}

}
