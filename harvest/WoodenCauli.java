package harvest;
import player.*;
import interfaces.*;
import util.Pair;
public class WoodenCauli extends Harvest {
	private Edible edibality;
	public WoodenCauli(int q){
		super(q);
		this.edibality = new UnconsumableHarvest(q);
		basePrice = 30;
		baseEnergy = 25;
	}

	@Override public String name(){
		return " Wooden Cauli";
	}

	@Override public Pair<Energy, Health> consume(){
		return edibality.consume();
	}

	@Override public boolean canBeEaten(){
		return edibality.canBeEaten();
	}
}
