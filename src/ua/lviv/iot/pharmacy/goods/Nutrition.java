package ua.lviv.iot.pharmacy.goods;

public class Nutrition extends GoodsOfPharmacy {
	private Food typeOfFood;
	private double volumePerCan;
	private String tasteOfFood;
	
	public Nutrition() {
		
	}
	
	public Nutrition(Food typeOfFood, double volumePerCan, String tasteOfFood) {
		super();
		this.typeOfFood = typeOfFood;
		this.volumePerCan = volumePerCan;
		this.tasteOfFood = tasteOfFood;
	}

	public Food getTypeOfFood() {
		return typeOfFood;
	}

	public void setTypeOfFood(Food typeOfFood) {
		this.typeOfFood = typeOfFood;
	}

	public double getVolumePerCan() {
		return volumePerCan;
	}

	public void setVolumePerCan(double volumePerCan) {
		this.volumePerCan = volumePerCan;
	}

	public String getTasteOfFood() {
		return tasteOfFood;
	}

	public void setTasteOfFood(String tasteOfFood) {
		this.tasteOfFood = tasteOfFood;
	}
	
	
}
