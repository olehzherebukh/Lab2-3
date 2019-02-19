package src.main.java.ua.lviv.iot.pharmacy.goods;

public class Vitamins extends GoodsOfPharmacy {

    private int amountOfPills;
    private int amountOfDifferentVitamins;
    private VitaminType typeOfVitamin;

    public Vitamins() {

    }

    public Vitamins(final int amountOfPills,
            final int amountOfDifferentVitamins,
           final VitaminType typeOfVitamin) {
        super();
        this.amountOfPills = amountOfPills;
        this.amountOfDifferentVitamins = amountOfDifferentVitamins;
        this.typeOfVitamin = typeOfVitamin;
    }

    public int getAmountOfPills() {
        return amountOfPills;
    }

    public void setAmountOfPills(final int amountOfPills) {
        this.amountOfPills = amountOfPills;
    }

    public int getAmountOfDifferentVitamins() {
        return amountOfDifferentVitamins;
    }

    public void setAmountOfDifferentVitamins(final
            int amountOfDifferentVitamins) {
        this.amountOfDifferentVitamins = amountOfDifferentVitamins;
    }

    public VitaminType getTypeOfVitamin() {
        return typeOfVitamin;
    }

    public void setTypeOfVitamin(final VitaminType typeOfVitamin) {
        this.typeOfVitamin = typeOfVitamin;
    }
}
