package harvest;
import interfaces.Shippable;
import interfaces.Edible;

public class Turnip extends Harvest implements Shippable, Edible {
	public Turnip(int q){
		super(q);
	}

	@Override public void consume(){
		System.out.println("turnip consumed");
	}

	@Override public void ship(){
		System.out.println("turnip shipped");
	}

	
}