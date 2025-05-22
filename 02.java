class Vehicle{
	private String liscensePlate;
	private String ownerName;
	private int hoursParked;
	
	
	Vehicle(String liscensePlate,String ownerName,int hoursParked){
		this.liscensePlate=liscensePlate;
		this.ownerName=ownerName;
		this.hoursParked=hoursParked;
	}
	public String getliscensePlate(){
		return liscensePlate;
	}
	public String getownername(){
		return  ownerName;
	}
	public int gethoursParked(){
		return hoursParked;
	}
	public String setliscensePlate(String liscensePlate){
		this.liscensePlate=liscensePlate;
	}
	public String setownername(String ownerName){
		this.ownerName=ownerName;
	}
	public int gethoursparked(int hoursParked){
		this.hoursParked=hoursParked;
	}
	public int
}

class ParkingLot{
	Vehicle[] vehicle=new Vehicle[5];
	int vehiclecount=0;
	public  void addvehicle(){
		if(vehiclecount<5)
		{
			vehicles[vehiclecount++]=Vehicle;
		}
		else
		{
			System.out.println("Vehicle parking is full");
		}
		
	}
}