package tool;
import interfaces.InventoryItem;
public abstract class Tool implements InventoryItem {
	int level;
	int usedTimes;
	
	public Tool(){

	}

	@Override public int amount(){
		return 1;
	}

	@Override public void addAmount(int am){
		// not really needed for amount 
	}
}