Abstract Principle:
public abstract class Vehicle { 
    // Private encapsulated fields
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    public Vehicle(String vehicleId,String model,double baseRentalRate){
        this.vehicleId= vehicleId;
        this.model=model;
        this.baseRentalRate= baseRentalRate;
        this.isAvailable= true; // Assuming new vehicles are available
    }
    public String getVehicleId(){
        return vehicleId;
    }
    public String getModel(){
        return model;
    }
    public double getBaseRentalRate(){
        return baseRentalRate;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public void setAvailable(boolean available){
        isAvailable= available;
    }
    public abstract double calculateRentalCost(int days);
    public abstract boolean isAvailableForRental();
Inheritance Hierarchy:
public class Car extends Vehicle{
    public Car(String vehicleId,String model,double baseRentalRate){
        super(vehicleId,model,baseRentalRate)
    }
}
@Overide
public double calculateRentalCost(int days){
    // Assuming a flat rate for simplicity
    return getBaseRentalRate()* days;
}
@Overide
public boolean isAvailableForRental(){
    return isAvailable();
}

public class Motorcycle extends Vehicle{
    public Motorcycle(String vehicleId,String model,double baseRentalRate:
    super(vehicleId,model,baseRentalRate));
}
@Overide
public double calculateRentalCost(int days){
    // Different calculation for motorcycle
    return getBaseRentalRate()* days* 0.9;// 10% discount
}
@Overide
public boolean isAvailableForRental(){
    return isAvailable();
}
public class Truck extends vehicle{
    public Truck(String vehicleId,String model,double baseRentalRate){
        super(vehicleId,model,baseRentalRate);
    }
}
@Overide 
public double calculateRentalCost(int days){
    // Different calculation for truck
    return getBaseRentalRate()* days *  1.2; // 20 surcharge
}
@Overide
public boolean isAvailableForRental(){
    return isAvailable();
}
}
Encapsulation:
// Inside Vehicle class
public void setBaseRentalRate(double baseRentalRate){
    if (baseRentalRate < 0) {
        throw new IllegalArgumentException("Base rental rate cannot be negative")
    }
    this.baseRentalRate= baseRentalRate;
    }
Polymorphism Implementation:
public interface Rentable {
     void rent(Customer customer, int days);
     void returnVehicle();
}
public class Car extends Vehicle implements Rentable{
    // Car-specific fields and methods
@Overide 
public void rent(Customer customer, int days){
    if (isAvailableForRental()) {
        setAvailable(false);
        // More rental logic
    }
}
@Overide
public void returnVehicle() {
    setAvailable(true);
    // More return logic
}
}
public class Customer {
    private String customerId;
    private String name;
    private List<Vehicle> rentalHistory;
    private List<Vehicle> currentRentals;

    // Customer-specific methods
}
public class RentalAgency {
    private List<Vehicle> fleet;
    private List<RentalTransaction> transaction;

    // Methods to manage fleet, process rentals, generate re
}
public class RentalTransaction {
    private String transactionId;
    private Customer customer;
    private Vehicle vehicle;
    private int rentalDays;
    private double rentalCost;
    private LocalDate rentalDate;


    // Transaction-specific methods
}

}
