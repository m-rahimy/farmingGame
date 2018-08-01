package composite;
import interfaces.*;
import util.Pair;
import player.*;
public class Unconsumable implements Edible {
	
	@Override public boolean canBeEaten(){
		return false;
	}
	
	@Override public Pair<Energy, Health> consume(){
		System.out.println("you cannot eat a " +" child!!! It's unconsumable!");
		return null;
	}
}