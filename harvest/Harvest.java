package harvest;
import interfaces.InventoryItem;
import interfaces.Shippable;
import interfaces.Edible;
import player.*;
import util.Pair;

public abstract class Harvest implements InventoryItem, Shippable, Edible {
	int quality;
	int baseEnergy = 5;
	int baseHealth = 6;
	int basePrice = 10;
	int amount = 1;
	String name;

	protected Edible edibality;

	public Harvest(String name, int quality){
		this.quality = quality;
		this.name = name;
	}

	@Override public String name(){
		return name;
	}

	public void setQuality(int q){
		quality = q;
	}

	@Override public void test(){
		System.out.println("inventory item test() called");
	}

	@Override public boolean canBeEaten(){
		return true;
	}

	@Override public Pair<Energy, Health> consume(){
		System.out.println(name() + " consumed");
		return new Pair<Energy,Health>(new Energy(baseEnergy * quality), new Health(10*quality));
	}

	@Override public Money ship(){
		System.out.println(name() + " shipped");
		return new Money(basePrice * quality);
	}

	public void increaseAmount(){
		amount++;
	}

	@Override public void addAmount(int am){
		amount += am;
	}

	@Override public boolean canBeMultiple(){
		return true;
	}

	@Override public boolean canBeShipped(){
		return true;
	}

	@Override public int amount(){
		return amount;
	}

	@Override public String toString(){
		return "Harvest { name: " + name() + ", amount: " +amount + ", quality: "+ quality + "}";
	}

	@Override public int hashCode() { return quality; }
}
