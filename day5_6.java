package nrec;
interface Kitchenitems{
	void kitchen();
}
interface Households{
	void households();
	
}
class Test1{
	void Biscuits() {
		System.out.println("Biscuits brands are:Oreo,Barboun,Parle-G");
	}
}
class Test2 extends Test1 implements Kitchenitems,Households{
	public void chocolate() {
		System.out.println("My Chocolate are: Dairy milk,munch");
	}
	public void kitchen() {
		System.out.println("Kitchen items list are: Ginger,turmeric,oil");
	}
	public void households() {
		System.out.println("Households things are:Bucket,vessels");
	}
}
class Test3 extends Test2{
	public void expenses() {
		System.out.println("One month expenses are: 20000");
	}
}

public class day5_6{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1=new Test1();
		Test2 t2=new Test2();
		Test3 t3=new Test3();
		t2.chocolate();
		t2.Biscuits();
		t2.kitchen();
		t2.households();
		t1.Biscuits();
		t3.expenses();
		t3.chocolate();

	}

}
