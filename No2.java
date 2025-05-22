package nrec;



class EmployeeException extends Exception{
	public EmployeeException(String message) {
		super(message);
	}
	
}
public class No2{
	
	private static int id;

	public static void checkId(int id) throws EmployeeException {
		
		if(id >999  ) {
			throw new EmployeeException("Exception caught Invalid Employee Id");
		}else {
			System.out.println("Valid Employee ID");
		}
	}

	public static void main(String[] args) {
		try {
			checkId(1000);
			
		}catch(EmployeeException e) {
			System.out.println(e.getMessage());
		}

	
}}