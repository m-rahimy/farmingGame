package interfaces;

public interface InventoryItem {
	public void test();
	public String name();
	public boolean canBeMultiple();
	public int amount();
	public void addAmount(int am);
}

