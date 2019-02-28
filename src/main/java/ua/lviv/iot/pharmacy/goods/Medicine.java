package ua.lviv.iot.pharmacy.goods;

public class Medicine extends GoodsOfPharmacy {

    private double amountOfMedicine;
    private String producingCountry;
    private MedicineType typeOfMedicine;

    public Medicine() {

    }

    public Medicine(final double amountOfMedicine,
            final String producingCountry,
            final MedicineType typeOfMedicine) {
        super();
        this.amountOfMedicine = amountOfMedicine;
        this.producingCountry = producingCountry;
        this.typeOfMedicine = typeOfMedicine;
    }

    public double getAmountOfMedicine() {
        return amountOfMedicine;
    }

    public void setAmountOfMedicine(final double amountOfMedicine) {
        this.amountOfMedicine = amountOfMedicine;
    }

    public String getProducingCountry() {
        return producingCountry;
    }

    public void setProducingCountry(final String producingCountry) {
        this.producingCountry = producingCountry;
    }

    public MedicineType getTypeOfMedicine() {
        return typeOfMedicine;
    }

    public void setTypeOfMedicine(final MedicineType typeOfMedicine) {
        this.typeOfMedicine = typeOfMedicine;
    }
    
    public String getHeaders() {
        return super.getHeaders()
                + "," + "amountOfMedicine"
                + "," + "producingCountry"
                + "," + "typeOfMedicine";
    }
    
    public String toCSV() {
        return super.toCSV()
                + "," + amountOfMedicine
                + "," + producingCountry
                + "," + typeOfMedicine;
    }
}
