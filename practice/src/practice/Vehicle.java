package practice;

public class Vehicle {
	public int speed;
	public int direction;
	public String ownerName;
	public static int nextId = 0;
	public int vehicleId;
	
	Vehicle(){
		vehicleId = nextId;
		nextId ++;
	}
	
	Vehicle(String ownerName) {
		this();
		this.ownerName = ownerName;
	}
	
	public static int returnMaxVehicleId() {
		return Vehicle.nextId - 1;
	}
	
	public String toString( ) {
		return "vehicleId=" + vehicleId;
	}
	
	public static void main(String[] args) {
		Vehicle bus = new Vehicle("taguchi1");
		bus.speed = 40;
		System.out.println(bus);
		
		Vehicle taxi = new Vehicle("taguchi2");
		taxi.speed = 60;
		
		System.out.println(taxi.speed);
	}
}
