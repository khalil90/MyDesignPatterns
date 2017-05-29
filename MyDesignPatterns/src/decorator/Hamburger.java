package decorator;

public class Hamburger implements Sandwich{

	@Override
	public void type() {
		System.out.println("Hamburger: 5$");	
	}

}
