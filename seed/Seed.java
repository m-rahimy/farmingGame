package seed;
import interfaces.InventoryItem;

public abstract class Seed implements InventoryItem {
	int price = 10;
	int amount = 1;
	public Seed(int price){
		this.price = price;
	}

	@Override public void test(){
		System.out.println("inventory item test() called in Seed");
	}

	@Override public void addAmount(int am){
		amount += am;
	}

}