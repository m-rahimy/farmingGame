package harvest;
import interfaces.Shippable;
import interfaces.Edible;
import player.*;
import player.Money;
import util.Pair;
public class Turnip extends Harvest {
	public Turnip(int q){
		super(q);
		basePrice = 20;
		baseEnergy = 15;
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
}
