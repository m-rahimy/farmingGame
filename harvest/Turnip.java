package harvest;
import interfaces.InventoryItem;
import interfaces.Shippable;
import interfaces.Edible;
import player.*;
import util.Pair;

public class Turnip extends Harvest {
	
	public Turnip(int quality){
		super("Turnip" , quality);
	}

	@Override public int hashCode() { return quality; }

	@Override public boolean equals(Object p){
		if (!(p instanceof Turnip)) {
			return false;
		}
		if(!  ((Harvest)p).name.equals(this.name)    ){
			return false;
		}

		return this.quality==((Harvest) p).quality;
	}

}
