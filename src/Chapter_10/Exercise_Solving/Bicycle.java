package Chapter_10.Exercise_Solving;

import java.util.Scanner;

public class Bicycle implements CarbonFootPrint {

    private final String brand;
    private final String type; // human-powered or motor-powered
    private double price;

    // constructor
    public Bicycle(String brand, String type, double price) {
        type = BicycleTypeValidation(type);

        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    public static String BicycleTypeValidation(String str) {
        str = str.toLowerCase().trim();
        String validated;

        if (!(str.equals("human-powered") || str.equals("machine-powered")))
            throw new IllegalArgumentException("The type of the bicycle must either be \"human-powered\" or " +
                    "\"machine-powered\"");

        validated = str;

        return validated;
    }

    // returns Bicycle brand
    public String getBrand() {
        return brand;
    }

    // returns Bicycle type
    public String getType() {
        return type;
    }

    // returns Bicycle price
    public double getPrice() {
        return price;
    }

    // sets Bicycle price
    public void setPrice(double price) {
        this.price = price;
    }

    // returns a String representation of the bicycle
    @Override
    public String toString() {
        return String.format("\t\t\tBicycle%nBrand: %s%nType: %s%nPrice: %.2f", getBrand(), getType(), getPrice());
    }

    // calculates the carbon emission of the bicycle
    @Override
    public double getCarbonFootPrint() {
        Scanner sc = new Scanner(System.in);
        if (type.equals("motor-powered")) {
            System.out.print("Enter carbon emission of the bicycle per month: ");
            int carbonEmission = sc.nextInt();

            return carbonEmission * 19.4;
        } else {
            System.out.println("The current type of bicycle does not emit any carbon.");
            return 0;
        }
    }
}
