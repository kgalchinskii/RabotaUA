package models;

public class Car extends Item {

    private final int wheel = 4;
    private String brand;
    private String model;
    private String color;
    private int doors;

    public  Car(){

    }

    public Car(String type){
        super(type);
    }

    public String getBrand() {
        return brand;
    }

    public Car setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Car setColor(String color) {
        this.color = color;
        return this;
    }

    public int getDoors() {
        return doors;
    }

    public Car setDoors(int doors) {
        this.doors = doors;
        return this;
    }

}
