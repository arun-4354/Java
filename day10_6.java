package nrec;
interface Laptops{
	void type();
}
class Test{
	public void smarttv() {
		System.out.println("Tv Brands are: TCL,SONY,SAMSUNG");
	}
}
class Test36 extends Test implements Laptops{
	public void cccamera() {
		System.out.println("cccamera Brands are: Xa11,Wiprocamera");
	}
	public void type() {
		System.out.println("Laptop brands are:LG,Samsung,Hp");
	}
}
class Demo1{
	public void brands() {
		System.out.println("Most popular Brands: Apple,Samsung,Google");
	}
}
class Demo2 extends Demo1{
	public void pods() {
		System.out.println("Airpods Brands are: Apple,Boat");
	}
}
public class day10_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1=new Test();
		Test36 t2=new Test36();
		Demo1 t3=new Demo1();
		Demo2 t4=new Demo2();
		t1.smarttv();
		t2.type();
		t2.cccamera();
		t2.smarttv();
		t3.brands();
		t4.brands();
		t4.pods();

	}

}
