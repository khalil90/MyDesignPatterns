package prototype;

public class Rectangle extends Shape{

	public Rectangle() {
		type="Rectangle";
	}
	
	@Override
	void draw() {
		System.out.println("This is a rectangle");
		
	}

}
