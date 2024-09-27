package cz.wz.marysidy;

public class Car {
    private String model;
    private String color;
    private String spz;
    private double consumptionPer100km;

    public Car(String model, String color, String spz, double consumptionPer100km) {
        this.model = model;
        this.color = color;
        this.spz = spz;
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
        this.spz = spz;
    }

    public double getConsumptionPer100km() {
        return consumptionPer100km;
    }

    public void setConsumptionPer100km(double consumptionPer100km) {
        this.consumptionPer100km = consumptionPer100km;
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
