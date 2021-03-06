package Chapter_10.Exercise_Solving;

public class Car implements CarbonFootPrint{

    private final String manufacturer;
    private final String model;
    private final int yearBuilt;
    private double value;
    private int monthlyPetrolConsumption;

    public Car(String manufacturer, String model, int yearBuilt, double value, int monthlyPetrolConsumption) {
        if (yearBuilt < 1900 || yearBuilt > 2019)
            throw new IllegalArgumentException("The manufactured year must be > 1900 or < 2019");

        this.manufacturer = manufacturer;
        this.model = model;
        this.yearBuilt = yearBuilt;
        this.value = value;
        this.monthlyPetrolConsumption = monthlyPetrolConsumption;
    }

    // returns the car manufacturer
    public String getManufacturer() {
        return manufacturer;
    }

    // returns the car model
    public String getModel() {
        return model;
    }

    // return the car's manufactured year
    public int getYearBuilt() {
        return yearBuilt;
    }

    // returns the value of the car
    public double getValue() {
        return value;
    }

    // sets the value of the car
    public void setValue(double value) {
        this.value = value;
    }

    // returns monthly petrol consumption
    public int getMonthlyPetrolConsumption() {
        return monthlyPetrolConsumption;
    }

    // sets monthly petrol consumption
    public void setMonthlyPetrolConsumption(int monthlyPetrolConsumption) {
        this.monthlyPetrolConsumption = monthlyPetrolConsumption;
    }

    // returns a String representation of the Car object
    @Override
    public String toString() {
        return String.format("\tCar%nManufacturer: %s%nModel: %s%nYear Manufactured: %d%nValue: %.2f",
                getManufacturer(), getModel(), getYearBuilt(), getValue());
    }

    // calculation the car's carbon emission
    @Override
    public double getCarbonFootPrint() {
        return monthlyPetrolConsumption * 19.4;
    }
}
