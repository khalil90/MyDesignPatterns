package decorator;



public abstract class SandwichDecorator implements Sandwich {
	   
	protected Sandwich decoratedSandwich;

	   public SandwichDecorator(Sandwich decoratedSandwich){
	      this.decoratedSandwich = decoratedSandwich;
	   }

	   public void type(){
		   decoratedSandwich.type();
	   }	
	}