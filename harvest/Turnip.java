package harvest;
import interfaces.Shippable;
import interfaces.Edible;
import player.Energy;
import player.Money;

public class Turnip extends Harvest implements Shippable, Edible {
	public Turnip(int q){
		super(q);
	}

	@Override public Energy consume(){
		System.out.println("turnip consumed");
	}

	@Override public Money ship(){
		System.out.println("turnip shipped");
	}

	
}