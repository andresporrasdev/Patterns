package singleton;

public class VehicleDriver {

	public static void main(String[] args) {
		
		VehicleManager vehicleManager = VehicleManager.getInstance();
		vehicleManager.addVehicle(new Car());
		vehicleManager.addVehicle(new Boat());

	//Creating another object on VehicleManager
	VehicleManager vehicleManager2 = VehicleManager.getInstance();
	
	//Demonstrating both instances are the same object
	System.out.println(vehicleManager);
	System.out.println(vehicleManager2);
	if (vehicleManager == vehicleManager2 ) {
		System.out.println("There are the same object");
		}
	
	}
}
