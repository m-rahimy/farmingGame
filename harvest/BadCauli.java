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

	@Override public Pair<Energy, Health> consume(){
		System.out.println(name() + " consumed");
		return new Pair<Energy,Health>(new Energy(baseEnergy * quality), new Health(10*quality));
	}

	@Override public Money ship(){
		System.out.println(name() + " shipped");
		return new Money(basePrice * quality);
	}

	@Override public String name(){
		return "Cauli";
	}

	@Override public int amount(){
		return amount;
	}

	@Override public boolean canBeShipped(){
		return false;
	}
}
