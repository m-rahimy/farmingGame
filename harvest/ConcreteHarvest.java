package harvest;
import interfaces.Shippable;
import interfaces.Edible;
import player.*;
import util.Pair;
import composite.*;

public class ConcreteHarvest extends Harvest {

	public ConcreteHarvest(String name, int q, Edible edibality, int baseEnergy, int basePrice){
		super(name, q);
		this.edibality = edibality;
		this.basePrice = basePrice;
		this.baseEnergy = baseEnergy;
	}

	@Override public Pair<Energy, Health> consume(){
		return edibality.consume();
	}

	@Override public boolean canBeEaten(){
		return edibality.canBeEaten();
	}

	@Override public String name(){
		return this.name;
	}

	@Override public boolean equals(Object p){
		if (!(p instanceof ConcreteHarvest)) {
			return false;
		}
		if(((Harvest)p).name != this.name    ){
			return false;
		}

		return this.quality==((ConcreteHarvest) p).quality;
	}
}
