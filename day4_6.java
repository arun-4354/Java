package nrec;
interface Cafe{
	void cafes();
}
interface Near{
	void near();
}
class Fav{
	void item() {
		System.out.println("My favourite is Kfc ");
	}
}
class Place extends Fav implements Cafe,Near{
	public void locations() {
		System.out.println("Concu ,chaibunk, Makau");
	}
	public void cafes() {
		System.out.println("Cafes in Kamareddy : ");
	}
	public void near() {
		System.out.println("Near by Bustop are : ");
	}
}

public class day4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fav f1=new Fav();
		Place p1=new Place();
		p1.cafes();
		p1.near();
		p1.locations();
		f1.item();

	}

}
