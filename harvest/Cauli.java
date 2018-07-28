package harvest;
import interfaces.Shippable;
import interfaces.Edible;
import player.*;
import player.Money;
import util.Pair;
public class Cauli extends Harvest implements Shippable, Edible {
	public Cauli(int q){
		super(q);
		basePrice = 30;
		baseEnergy = 25;
	}

	@Override public Pair<Energy, Health> consume(){
		System.out.println("turnip consumed");
		return new Pair<Energy,Health>(new Energy(baseEnergy * quality), new Health(10*quality));
	}

	@Override public Money ship(){
		System.out.println("turnip shipped");
		return new Money(basePrice * quality);
	}

	@Override public String name(){
		return "Cauli";
	}	

	@Override public int amount(){
		return amount;
	}
}