package sessions.classes_objects.covariant;

public class VehicleShop {

    //calculate price for vehicle based on it's number of wheels
    //and gas or diesel
    public static double estimatePrice(Vehicle vehicle){
        if(vehicle.isGas() && vehicle.getNumOfVehicles() == 4){
            return 5000.00;
        }else if(vehicle.isGas() && vehicle.getNumOfVehicles() < 4 && vehicle.getNumOfVehicles() >0){
            return 2000.00;
        }else{
            System.out.println("More features to come");
            return 0;
        }

    }
}
