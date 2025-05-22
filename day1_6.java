package nrec;
interface Employname{
	void name();
}
interface EmployPno{
	void Pno();
}
interface Employadd extends Employname,EmployPno{
	void add();
}
public class day1_6 implements Employadd {
	public void display() {
		System.out.println("All details:");
	}
	public void name() {
		System.out.println("Name: Arun");
	}
	public void Pno() {
		System.out.println("Pno: 9573xxxxxx");
	}
	public void add() {
		System.out.println("Village: Kamareddy");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day1_6 d1=new day1_6();
		d1.display();
		d1.name();
		d1.Pno();
		d1.add();

	}

}
