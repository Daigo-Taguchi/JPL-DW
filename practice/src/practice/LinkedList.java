package practice;

public class LinkedList {
	public Object object;
	public LinkedList nextAccess; 
	
	LinkedList(Vehicle vehicle) {
		this.object = vehicle;
	}
	
	public String toString() {
		String desc = this.object + "nextAccess=" + this.nextAccess;
		return desc;
	}
	
	public static void main(String[] args) {
		Vehicle motorbike = new Vehicle("taguchi");
		Vehicle car = new Vehicle("taguchi");
		car.vehicleId = 1;
		
		LinkedList list1 = new LinkedList(motorbike);
		LinkedList list2 = new LinkedList(car);
		System.out.println(list1);
	}
}
