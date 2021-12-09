package model;

import java.util.Comparator;

/**
 * @author jakem - jrmeyer4
 * CIS175 - Fall 2021
 * Dec 6, 2021
 */
//This class is needed so a crop object can be put into a queue
public class CropComparator implements Comparator<Crop> {
//this method is necessary for this class to compare two crop objects and how you want the queue to put them
	@Override
	public int compare(Crop o1, Crop o2) {
		if(o1.getYeild() < o2.getYeild())
			return 1;
		else if (o1.getYeild() > o2.getYeild())
			return -1;
		return 0;
	}

}
