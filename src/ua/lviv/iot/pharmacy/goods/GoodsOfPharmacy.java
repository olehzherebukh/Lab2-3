package ua.lviv.iot.pharmacy.goods;

public class GoodsOfPharmacy {
	
	private double priceOfGood;
	private String nameOfGood;
	private Quality qualityOfGood;
	private int amountOfCustomersPerDay;
	private TypeOfGood typeOfGood;
	
	public GoodsOfPharmacy() {
		
	}
	
	public GoodsOfPharmacy(double priceOfGood, String nameOfGood, Quality qualityOfGood, int amountOfCustomersPerDay,
			TypeOfGood typeOfGood) {
		super();
		this.priceOfGood = priceOfGood;
		this.nameOfGood = nameOfGood;
		this.qualityOfGood = qualityOfGood;
		this.amountOfCustomersPerDay = amountOfCustomersPerDay;
		this.typeOfGood = typeOfGood;
	}

	public double getPriceOfGood() {
		return priceOfGood;
	}
	
	public void setPriceOfGood(double priceOfGood) {
		this.priceOfGood = priceOfGood;
	}
	
	public String getNameOfGood() {
		return nameOfGood;
	}
	
	public void setNameOfGood(String nameOfGood) {
		this.nameOfGood = nameOfGood;
	}
	
	public Quality getQualityOfGood() {
		return qualityOfGood;
	}
	
	public void setQualityOfGood(Quality qualityOfGood) {
		this.qualityOfGood = qualityOfGood;
	}
	
	public int getAmountOfCustomersPerDay() {
		return amountOfCustomersPerDay;
	}
	
	public void setAmountOfCustomersPerDay(int amountOfCustomersPerDay) {
		this.amountOfCustomersPerDay = amountOfCustomersPerDay;
	}
	
	public TypeOfGood getTypeOfGood() {
		return typeOfGood;
	}
	
	public void setTypeOfGood(TypeOfGood typeOfGood) {
		this.typeOfGood = typeOfGood;
	}

	@Override
	public String toString() {
		return "GoodsOfPharmacy [priceOfGood=" + priceOfGood + ", nameOfGood=" + nameOfGood + ", qualityOfGood="
				+ qualityOfGood + ", amountOfCustomersPerDay=" + amountOfCustomersPerDay + ", typeOfGood=" + typeOfGood
				+ "]";
	}
	
	
}
