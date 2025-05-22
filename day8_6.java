package nrec;
interface Tiffins{
	void tiffins();
}
interface Biryani{
	void biryani();
}
interface Cooldrinks{
	void Drinks();
}
class Desert implements Tiffins,Biryani,Cooldrinks{
	public void desert() {
		System.out.println("Deserts are: double ka meta,Gulab Jamun,Rasmalia");
	}
	public void Tiffins() {
		System.out.println("Tiffins are :Bonda,Dosa,Idly,Poori,Vada");
	}
	public void Biryani() {
		System.out.println("All Biryani");
	}
	public void Drinks() {
		System.out.println("Cool Drinks : Soft drinks,Milk Shakes,Juices");
	}
	@Override
	public void biryani() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void tiffins() {
		// TODO Auto-generated method stub
		
	}
}

interface hotel{
	void Hotel();
}
class list extends Desert implements hotel{
	public void Biryani() {
		System.out.println("ITEMS Details are:");
	}
	public void Hotel() {
		System.out.println("kAMAREDDY MESS");
	}
}

public class day8_6{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		list m1=new list();
		Desert d1=new Desert();
		m1.Hotel();
		m1.Biryani();
		d1.biryani();
		d1.Tiffins();
		d1.Drinks();
		d1.desert();

	}

}
