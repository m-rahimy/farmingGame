package player;
import interfaces.InventoryItem;
import java.util.*;

public class Inventory {
	private Set<InventoryItem> inventoryItems = new HashSet();

	public Inventory(){

	}

	public void add(InventoryItem item){
		if (inventoryItems.contains(item)){
			System.out.println("cintains!!!");
			Iterator<InventoryItem> iter = inventoryItems.iterator();
			while(iter.hasNext()){
				InventoryItem ii = (InventoryItem) iter.next();
				System.out.println(ii);
				if(ii.equals(item)){
					ii.addAmount(item.amount());
					System.out.println("added amount: "+ item.amount());
					System.out.println("new amount: "+ ii.amount());
				}
				
			}
			//inventoryItems.get(item).addAmount(item.amount());
		}else{
			inventoryItems.add(item);
		}
		System.out.println("added "+item+" to inv.");
	}

	public void remove(InventoryItem item){
		inventoryItems.remove(item);		
	}

	@Override public String toString(){
		return "inventory data = "+ 0;
	}

	public Set<InventoryItem> getItemList(){
		return inventoryItems ;
	}
}