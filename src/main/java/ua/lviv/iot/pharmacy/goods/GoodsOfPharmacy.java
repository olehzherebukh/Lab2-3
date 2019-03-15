package ua.lviv.iot.pharmacy.goods;

public class GoodsOfPharmacy {

    private double priceOfGood;
    private String nameOfGood;
    private Quality qualityOfGood;
    private int amountOfCustomersPerDay;
    private TypeOfGood typeOfGood;

    public GoodsOfPharmacy() {

    }

    public GoodsOfPharmacy(final double priceOfGood,
            final String nameOfGood,
            final Quality qualityOfGood,
            final int amountOfCustomersPerDay,
            final TypeOfGood typeOfGood) {
        super();
        this.priceOfGood = priceOfGood;
        this.nameOfGood = nameOfGood;
        this.qualityOfGood = qualityOfGood;
        this.amountOfCustomersPerDay = amountOfCustomersPerDay;
        this.typeOfGood = typeOfGood;
    }

    public final double getPriceOfGood() {
        return priceOfGood;
    }

    public final void setPriceOfGood(final double priceOfGood) {
        this.priceOfGood = priceOfGood;
    }

    public final String getNameOfGood() {
        return nameOfGood;
    }

    public final void setNameOfGood(final String nameOfGood) {
        this.nameOfGood = nameOfGood;
    }

    public final Quality getQualityOfGood() {
        return qualityOfGood;
    }

    public final void setQualityOfGood(final Quality qualityOfGood) {
        this.qualityOfGood = qualityOfGood;
    }

    public final int getAmountOfCustomersPerDay() {
        return amountOfCustomersPerDay;
    }

    public final void setAmountOfCustomersPerDay(final int
            amountOfCustomersPerDay) {
        this.amountOfCustomersPerDay = amountOfCustomersPerDay;
    }

    public final TypeOfGood getTypeOfGood() {
        return typeOfGood;
    }

    public final void setTypeOfGood(final TypeOfGood typeOfGood) {
        this.typeOfGood = typeOfGood;
    }

    @Override
    public final String toString() {
        return "GoodsOfPharmacy [priceOfGood=" + priceOfGood
                + ", nameOfGood="
                + nameOfGood
                + ", qualityOfGood="
                + qualityOfGood
                + ", amountOfCustomersPerDay="
                + amountOfCustomersPerDay
                + ", typeOfGood="
                + typeOfGood
                + "]";
    }
    
    public String getHeaders() {
        return "priceOfGood"
                + "," + "nameOfGood"
                + "," + "qualityOfGood"
                + "," + "amountOfCustomersPerDay"
                + "," + "typeOfGood";
    }
    
    public String toCSV() {
        return priceOfGood
                + "," + nameOfGood
                + "," + qualityOfGood
                + "," + amountOfCustomersPerDay
                + "," + typeOfGood;
    }
}
