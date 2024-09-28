package cz.wz.marysidy;

public class Car {
    private String model;
    private String color;
    private String spz;
    private double consumptionPer100km;

    public Car(String model, String color, String spz, double consumptionPer100km) {
//        if(!isValidSpz(spz)){
//            throw new IllegalArgumentException("Invalid registration number: " + spz);
//        }
        this.model = model;
        this.color = color;
        setSpz(spz);
        this.consumptionPer100km = consumptionPer100km;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpz() {
        return spz;
    }

    public void setSpz(String spz) {
        if(isValidSpz(spz)){
            this.spz = spz;
        } //else{
////            System.out.println("The car was not added due to an invalid registration number.");
////            System.out.println("/*-".repeat(20));
//            throw new IllegalArgumentException("The car was not added due to an invalid registration number.");
//        }
    }

    public double getConsumptionPer100km() {
        return consumptionPer100km;
    }

    public void setConsumptionPer100km(double consumptionPer100km) {
        this.consumptionPer100km = consumptionPer100km;
    }

    // Methods
    private boolean isValidSpz(String spz){
        // length control
        if(spz.length()<5 || spz.length()>7){
            System.out.println("Invalid length of registration number.");
            return  false;
        }
        // Check for invalid characters
        if(spz.toUpperCase().matches(".*[GQOW].*") || spz.matches(".*[№!%:,\\[\\].{};()<>'\"`].*")){
            System.out.println("Invalid character / symbol in the registration number.");
            return false;
        }
        return true;

    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", spz='" + spz + '\'' +
                ", consumption per 100 km=" + consumptionPer100km +
                '}';
    }
}
