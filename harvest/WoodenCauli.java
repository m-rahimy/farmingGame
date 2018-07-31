package harvest;
import player.*;
import util.Pair;
public class WoodenCauli extends Harvest {
	public WoodenCauli(int q){
		super(q);
		basePrice = 30;
		baseEnergy = 25;
	}

	@Override public String name(){
		return " Wooden Cauli";
	}

	@Override public Pair<Energy, Health> consume(){
		System.out.println("you cannot eat a "+ name() +" child!!!");
		return null;
	}


	@Override public boolean canBeEaten(){
		return false;
	}
}
