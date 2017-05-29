package decorator;

public class Main {

	public static void main(String[] args) {
		
		Sandwich hamburger = new Hamburger();
		
		hamburger.type();
		
		Sandwich toastedHam=new ToastedBreadDecorator(hamburger);
		
		toastedHam.type();
		
		Sandwich hotDog=new HotDog();
		
		hotDog.type();
		
		Sandwich toastedHot= new ToastedBreadDecorator(hotDog);
		
		toastedHot.type();
		
		
		
		

	}

}
