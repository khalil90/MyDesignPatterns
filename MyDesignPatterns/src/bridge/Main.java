package bridge;

public class Main {

	public static void main(String[] args) {
	
		ProgramDriver p1= new ConcreteDriver(new DriverV1());
		
		p1.install();
		
		ProgramDriver p2= new ConcreteDriver(new DriverV2());

		p2.install();
	}

}
