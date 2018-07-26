package player;
import tool.*;
import interfaces.InventoryItem;
import util.Pair;
 
public class Player {
	private Money money;
	private Energy energy;
	private Health health;

	private String name;

	private Inventory inventory;

	public Player(String name){
		this.name = name;

		this.money = new Money(500);
		this.energy = new Energy(100);
		this.health = new Health(200);
		this.inventory = new Inventory();
		fillInitInventory();
	}

	private void fillInitInventory(){
		inventory.add(new Axe());
	}

	public void putToInventory(InventoryItem item){
		inventory.add(item);
	}

	public void removeFromInventory(InventoryItem item){
		inventory.remove(item);
	}

	public void devour(Pair<Energy, Health> input){
		energy.increase(input.getA().get());
		health.increase(input.getB().get());
	}

	@Override public String toString(){
		String data = "name: "+ name + ",\t" + money+ ",\t" + energy + ",\t"+ health;
		String inv = ", \t items : ";
		for(InventoryItem invItem :  inventory.getItemList()){
			inv += invItem.name();
			inv += ", \t";
		}
		return data+inv;
	}
}