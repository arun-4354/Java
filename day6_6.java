package nrec;
interface  TwoWheeler{
	void cars();
}
interface Vehicle{
	void bikes();
}
interface Cycle extends TwoWheeler,Vehicle{
	void cycle();
}
class BigVehicle{
	void trucks() {
		System.out.println("Trucks are: TATA,BHARATHBENZ,ASHOKLEYLAND");
	}
}
class Scooter extends BigVehicle implements Cycle{
	public void scooty() {
		System.out.println("Scooties are : Activa,Suzuki");
	}
	public void cars() {
		System.out.println("Cars are:Benz,Fortuner");
	}
	public void cycle() {
		System.out.println("cycle are:Atlas,");
	}
	public void bikes() {
		System.out.println("Bikes are : Rx100,Ktm");
	}
	
}

public class day6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scooter s1=new Scooter();
		BigVehicle t1=new BigVehicle();
		s1.cars();
		s1.cycle();
		s1.scooty();
		s1.bikes();
		t1.trucks();
		
	}

}
