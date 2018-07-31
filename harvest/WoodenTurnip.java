package harvest;
import interfaces.Shippable;
import interfaces.Edible;
import player.*;
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

	@Override public boolean equals(Object p){
		if (!(p instanceof WoodenTurnip)) {
			return false;
		}
		return this.quality==((WoodenTurnip) p).quality;
	}

	@Override public int hashCode(){
		return quality;
	}
}
