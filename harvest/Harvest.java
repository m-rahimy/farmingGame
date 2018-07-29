package harvest;
import interfaces.InventoryItem;

public abstract class Harvest implements InventoryItem {
	int quality;
	int baseEnergy = 5;
	int baseHealth = 6;
	int basePrice = 10;
	int amount = 1;

	public Harvest(int quality){
		this.quality = quality;
	}

	public	void setQuality(int q){
		quality = q;
	}

	@Override public void test(){
		System.out.println("inventory item test() called");
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

	@Override public String toString(){
		return "Harvest { name: " + name() + ", amount: " +amount + ", quality: "+ quality + "}";
	}

}