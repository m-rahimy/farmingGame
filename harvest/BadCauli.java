package harvest;
import player.*;
import player.Money;
import util.Pair;
public class BadCauli extends Harvest {
	public BadCauli(int q){
		super(q);
		basePrice = 0;
		baseEnergy = 25;
	}

	@Override public String name(){
		return "Cauli";
	}

	@Override public boolean canBeShipped(){
		return false;
	}
}
