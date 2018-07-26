package player;
import interfaces.InventoryItem;
import java.util.*;

public class Inventory {
	private List<InventoryItem> inventoryItems = new ArrayList();

	public Inventory(){

	}

	public void add(InventoryItem item){
		inventoryItems.add(item);
		System.out.println("added "+item+" to inv.");
	}

	public void remove(InventoryItem item){
		inventoryItems.remove(item);		
	}

	@Override public String toString(){
		return "inventory data = "+ 0;
	}

	public List<InventoryItem> getItemList(){
		return inventoryItems ;
	}
}