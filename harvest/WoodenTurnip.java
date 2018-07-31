package harvest;
import interfaces.Shippable;
import interfaces.Edible;
import player.*;
import player.Money;
import util.Pair;
public class WoodenTurnip extends Harvest {
	public WoodenTurnip(int q){
		super(q);
		basePrice = 20;
		baseEnergy = 0;
	}

	@Override public Pair<Energy, Health> consume(){
		System.out.println("you cannot eat a "+ name() +" child!!!");
		return null;
	}

	@Override public boolean canBeEaten(){
		return false;
	}

	@Override public String name(){
		return "Wooden Turnip";
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
