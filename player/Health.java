package player;

public class Health {
	private int  health ;
	public Health (int health ){
		this.health   = health ;
	}

	public int get(){
		return health;
	}

	public void increase(int amount){
		this.health += amount;
	}


	@Override public String toString(){
		return "health  = "+ health ;
	}
}