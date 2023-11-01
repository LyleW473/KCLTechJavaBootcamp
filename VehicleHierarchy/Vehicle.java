public class Vehicle {
    
    public String make = "None";
    public String model = "None";

    public static void main(String[] args)
    {
        Vehicle myVehicle = new Vehicle();
        Motorcycle myMotorcycle = new Motorcycle();

        myVehicle.start();
        myMotorcycle.start();
    }

    public void start()
    {
        System.out.println("Vehicle is starting!");
    }

}
