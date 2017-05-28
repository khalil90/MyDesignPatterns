package observer;

public class Main {

	public static void main(String[] args) {
		
		Company company = new Company("Test1");
		
		Employee employee = new Employee();

		company.addObserver(employee);
		
		company.setName("Test2");
		
		System.out.println(employee.getCompany().getName());
	
	    company.setName("Test3");
	    
	    System.out.println(employee.getCompany().getName());
	
	}

}
