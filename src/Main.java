import java.util.ArrayList;
import java.util.Scanner;

class Bike {
    private String brand;
    private String model;
    private double price;

    public Bike(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Price: $" + price;
    }
}

class Showroom {
    private ArrayList<Bike> bikes;

    public Showroom() {
        bikes = new ArrayList<>();
    }

    public void addBike(Bike bike) {
        bikes.add(bike);
    }

    public void displayBikes() {
        if (bikes.isEmpty()) {
            System.out.println("No bikes available in the showroom.");
        } else {
            System.out.println("Bikes available in the showroom:");
            for (int i = 0; i < bikes.size(); i++) {
                System.out.println((i + 1) + ". " + bikes.get(i));
            }
        }
    }

    public Bike getBike(int index) {
        return bikes.get(index);
    }
    
    public int getBikesCount() {
        return bikes.size();
    }
}