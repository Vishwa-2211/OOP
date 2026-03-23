class Vehicle 
{
    protected String vehicleNumber;
    protected String brand;
    protected String fuelType;

    Vehicle(String vehicleNumber, String brand, String fuelType) 
    {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.fuelType = fuelType;
    }

    void displayDetails() 
    {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle 
{
    protected int numberOfSeats;
    protected boolean ACavailable;

    Car(String vehicleNumber, String brand, String fuelType,
        int numberOfSeats, boolean ACavailable) 
    {

        super(vehicleNumber, brand, fuelType); 
        this.numberOfSeats = numberOfSeats;
        this.ACavailable = ACavailable;
    }

    @Override
    void displayDetails() 
    {
        super.displayDetails(); 
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("AC Available: " + ACavailable);
    }
}

class ElectricCar extends Car 
{
    private int batteryCapacity;
    private double chargingTime;

    ElectricCar(String vehicleNumber, String brand, String fuelType,
                int numberOfSeats, boolean ACavailable,
                int batteryCapacity, double chargingTime) 
    {

        super(vehicleNumber, brand, fuelType, numberOfSeats, ACavailable);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    @Override
    void displayDetails() 
    {
        super.displayDetails();  
        System.out.println("Battery Capacity (kWh): " + batteryCapacity);
        System.out.println("Charging Time (hours): " + chargingTime);
    }

    void ecoMode() 
    {
        System.out.println("Electric Car is running in Eco Mode");
    }
}

public class Practical25
 {
    public static void main(String[] args) 
    {
	System.out.println("250393107014");
        System.out.println("----- Vehicle Object -----");
        Vehicle v1 = new Vehicle("GJ01AB1234", "Honda", "Petrol");
        v1.displayDetails();

        System.out.println("\n----- Car Object -----");
        Vehicle v2 = new Car("GJ05CD5678", "Hyundai", "Diesel", 5, true);
        v2.displayDetails();  

        System.out.println("\n----- Electric Car Object -----");
        Vehicle v3 = new ElectricCar("GJ10EF9999", "Tata", "Electric",
                                      5, true, 50, 1.5);
        v3.displayDetails();  
       
        if (v3 instanceof ElectricCar) 
	{
            ElectricCar ec = (ElectricCar) v3;  
            ec.ecoMode();  
        }
    }
}