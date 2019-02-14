package ua.lviv.iot.pharmacy.goods;

public class Vitamins extends GoodsOfPharmacy {
	
	private int amountOfPills;
	private int amountOfDifferentVitamins;
	private VitaminType typeOfVitamin;
	
	public Vitamins() {
		
	}
	
	public Vitamins(int amountOfPills, int amountOfDifferentVitamins, VitaminType typeOfVitamin) {
		super();
		this.amountOfPills = amountOfPills;
		this.amountOfDifferentVitamins = amountOfDifferentVitamins;
		this.typeOfVitamin = typeOfVitamin;
	}

	public int getAmountOfPills() {
		return amountOfPills;
	}
	
	public void setAmountOfPills(int amountOfPills) {
		this.amountOfPills = amountOfPills;
	}
	
	public int getAmountOfDifferentVitamins() {
		return amountOfDifferentVitamins;
	}
	
	public void setAmountOfDifferentVitamins(int amountOfDifferentVitamins) {
		this.amountOfDifferentVitamins = amountOfDifferentVitamins;
	}
	
	public VitaminType getTypeOfVitamin() {
		return typeOfVitamin;
	}
	
	public void setTypeOfVitamin(VitaminType typeOfVitamin) {
		this.typeOfVitamin = typeOfVitamin;
	}
	
	
}
