package ua.lviv.iot.pharmacy.goods;

public class Nutrition extends GoodsOfPharmacy {
    private Food typeOfFood;
    private double volumePerCan;
    private String tasteOfFood;

    public Nutrition() {

    }

    public Nutrition(final Food typeOfFood,
            final double volumePerCan,
            final String tasteOfFood) {
        super();
        this.typeOfFood = typeOfFood;
        this.volumePerCan = volumePerCan;
        this.tasteOfFood = tasteOfFood;
    }

    public Food getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(final Food typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    public double getVolumePerCan() {
        return volumePerCan;
    }

    public void setVolumePerCan(final double volumePerCan) {
        this.volumePerCan = volumePerCan;
    }

    public String getTasteOfFood() {
        return tasteOfFood;
    }

    public void setTasteOfFood(final String tasteOfFood) {
        this.tasteOfFood = tasteOfFood;
    }
    
    public String getHeaders() {
        return super.getHeaders()
                + "," + "typeOfFood"
                + "," + "volumePerCan"
                + "," + "tasteOfFood";
    }
    
    public String toCSV() {
        return super.toCSV()
                + "," + typeOfFood
                + "," + volumePerCan
                + "," + tasteOfFood;
    }
}
