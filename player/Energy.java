package player;

public class Energy {
	private int energy;
	public Energy(int energy){
		this.energy = energy;
	}

	public int get(){
		return energy;
	}

	public void increase(int amount){
		this.energy += amount;
	}

	@Override public String toString(){
		return "energy = "+ energy;
	}
}