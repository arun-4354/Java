package nrec;

public class No1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50};
		int a= Integer.parseInt(args[0]);
		try {
			System.out.println(arr[a]);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}


}
