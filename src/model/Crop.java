package model;



/**
 * @author jakem - jrmeyer4
 * CIS175 - Fall 2021
 * Nov 30, 2021
 */

//this class is the class you use to create a crop object containing yeild amount per bushel the year and the name of the plant/seed name
//class contains the basic stuff like constructor and setters and getters
public class Crop  {
	
	
	  private double yeild; private double amtPerBushel; private int year; private String plantName;
	  
	  public Crop() { super();
	  
	  }
	  
	  public Crop(double yeild, double amtPerBushel, int year) { super();
	  this.yeild = yeild; this.amtPerBushel = amtPerBushel; this.year = year; }
	  
	  public double getYeild() { return yeild; }
	  
	  public double getAmtPerBushel() { return amtPerBushel; }
	  
	  public void setAmtPerBushel(double amtPerBushel) { this.amtPerBushel =
	  amtPerBushel; }
	  
	  public int getYear() { return year; }
	  
	  public void setYear(int year) { this.year = year; }

	
	public void setYeild(double yeild) {
		this.yeild = yeild;
	}

	public String getPlantName() {
		return plantName;
	}

	public void setPlantName(String plantName) {
		this.plantName = plantName;
	}

	@Override
	public String toString() {
		return "Crop [yeild=" + yeild + ", amtPerBushel=" + amtPerBushel + ", year=" + year + ", plantName=" + plantName
				+ "]";
	}
//the tostring is to see the info outputed
	
	

	
}

