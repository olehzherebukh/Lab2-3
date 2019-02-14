package ua.lviv.iot.pharmacy.goods;

public class Medicine extends GoodsOfPharmacy {
	
	private double amountOfMedicine;
	private String producingCountry;
	private MedicineType typeOfMedicine;
	
	public Medicine() {
		
	}
	
	public Medicine(double amountOfMedicine, String producingCountry, MedicineType typeOfMedicine) {
		super();
		this.amountOfMedicine = amountOfMedicine;
		this.producingCountry = producingCountry;
		this.typeOfMedicine = typeOfMedicine;
	}

	public double getAmountOfMedicine() {
		return amountOfMedicine;
	}
	
	public void setAmountOfMedicine(double amountOfMedicine) {
		this.amountOfMedicine = amountOfMedicine;
	}
	
	public String getProducingCountry() {
		return producingCountry;
	}
	
	public void setProducingCountry(String producingCountry) {
		this.producingCountry = producingCountry;
	}
	
	public MedicineType getTypeOfMedicine() {
		return typeOfMedicine;
	}
	
	public void setTypeOfMedicine(MedicineType typeOfMedicine) {
		this.typeOfMedicine = typeOfMedicine;
	}
	
	
	
}
