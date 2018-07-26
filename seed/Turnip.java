package seed;
//import interfaces.InventoryItem;

public class Turnip extends Seed {
	
	public Turnip(int price){
		super(price);
	}

	@Override public String name(){
		return "Turnip Seeds";
	}
	
	@Override public int amount (){
		return amount;
	}

	@Override public boolean canBeMultiple(){
		return true;
	}
}