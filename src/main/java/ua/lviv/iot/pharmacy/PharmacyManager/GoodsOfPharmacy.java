package ua.lviv.iot.pharmacy.PharmacyManager;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GoodsOfPharmacy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private double priceOfGood;
    private String nameOfGood;
    private String qualityOfGood;
    private int amountOfCustomersPerDay;
    private String typeOfGood;

    public GoodsOfPharmacy() {

    }

    public GoodsOfPharmacy(final double priceOfGood,
            final String nameOfGood, final String qualityOfGood,
            final int amountOfCustomersPerDay, final String typeOfGood) {
        super();
        this.priceOfGood = priceOfGood;
        this.nameOfGood = nameOfGood;
        this.qualityOfGood = qualityOfGood;
        this.amountOfCustomersPerDay = amountOfCustomersPerDay;
        this.typeOfGood = typeOfGood;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public final String getQualityOfGood() {
        return qualityOfGood;
    }

    public final void setQualityOfGood(final String qualityOfGood) {
        this.qualityOfGood = qualityOfGood;
    }

    public final int getAmountOfCustomersPerDay() {
        return amountOfCustomersPerDay;
    }

    public final void setAmountOfCustomersPerDay(final
            int amountOfCustomersPerDay) {
        this.amountOfCustomersPerDay = amountOfCustomersPerDay;
    }

    public final String getTypeOfGood() {
        return typeOfGood;
    }

    public final void setTypeOfGood(final String typeOfGood) {
        this.typeOfGood = typeOfGood;
    }

    @Override
    public final String toString() {
        return "GoodsOfPharmacy [priceOfGood=" + priceOfGood
                + ", nameOfGood=" + nameOfGood + ", qualityOfGood="
                + qualityOfGood + ", amountOfCustomersPerDay="
                + amountOfCustomersPerDay + ", typeOfGood=" + typeOfGood
                + "]";
    }

}
