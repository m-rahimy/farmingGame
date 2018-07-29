package harvest;
import interfaces.Shippable;
import interfaces.Edible;
import player.*;
import player.Money;
import util.Pair;
public class Turnip extends Harvest implements Shippable, Edible {
	public Turnip(int q){
		super(q);
		basePrice = 20;
		baseEnergy = 15;
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
		return "Turnip";
	}	

	@Override public int amount(){
		return amount;
	}

	@Override public boolean equals(Object p){
		if (!(p instanceof Turnip)){
			return false;
		}
		return this.quality==((Turnip) p).quality;
	}

	@Override public int hashCode(){
		return quality;
	}	
}