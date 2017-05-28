package observer;

import java.util.Observable;
import java.util.Observer;

public class Employee implements  Observer{
	
	private Company company;

	@Override
	public void update(Observable o, Object arg) {
		
		company=(Company)o;
		
		System.out.println("The current name is "+company.getName());
		
		
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	

}
