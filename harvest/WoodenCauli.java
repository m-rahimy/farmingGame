package harvest;
import player.*;
import interfaces.*;
import util.Pair;
import composite.*;

public class WoodenCauli extends Harvest {

	public WoodenCauli(int q){
		super(q);
		this.edibality = new Unconsumable();
		basePrice = 30;
		baseEnergy = 0;
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

	@Override public boolean equals(Object other){
		if(!(other instanceof WoodenCauli)) return false;
		else return ((WoodenCauli) other).quality == this.quality;
	}
}
