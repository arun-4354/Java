package nrec;
interface Person{
	void name();
}
interface Pno extends Person{
	void pno();
}
class Sample implements Pno{
	public void add() {
		System.out.println("Welcome");
	}
	public void name() {
		System.out.println("Arun");
	}
	public void pno() {
		System.out.println("4354");
	}
}
class Sample1 implements Pno{
	public void Roll() {
		System.out.println("Rollnum:436");
	}
	public void name() {
		System.out.println("Name:nani");
	}
	public void pno() {
		System.out.println("pno :9967xxxxxx");
	}
}

public class day2_6  {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s1=new Sample();
		Sample1 s2=new Sample1();
		s1.add();
		s1.name();
		s1.pno();
		s2.Roll();
		s2.name();
		s2.pno();
        

	}

}
