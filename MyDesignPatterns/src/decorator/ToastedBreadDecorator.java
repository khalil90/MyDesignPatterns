package decorator;

public class ToastedBreadDecorator extends SandwichDecorator {

	public ToastedBreadDecorator(Sandwich decoratedSandwich) {
		super(decoratedSandwich);
	}

	 @Override
	   public void type() {
		        
	      setRedBread(decoratedSandwich);
	   }

	   private void setRedBread(Sandwich decoratedShape){
		      System.out.println("Bread:Toasted + 1$");
		   } 
}

