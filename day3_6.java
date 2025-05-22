package nrec;
interface Restarunt{
	void kamareddy();
}
class Dish{
	public void  fav() {
		System.out.println("A1 bar");
			}
}
class Fivestar extends Dish implements Restarunt{
	public void near() {
		System.out.println("All in one Hotel");
	}
	public void kamareddy() {
		System.out.println("Hotel in kamareddy: ");
	}
}
class Menu extends Fivestar{
	public void Course() {
		System.out.println("Radhika");
	}
	
}

public class day3_6 {

	public static void main(String[] args) {
		Fivestar p1=new Fivestar();
		Menu m1=new Menu();
		p1.kamareddy();
		m1.Course();
		p1.near();
		p1.fav();

	}

}
