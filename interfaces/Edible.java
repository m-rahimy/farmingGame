package interfaces;
import player.*;
import util.*;

public interface Edible {
	public Pair<Energy, Health> consume();
	public boolean canBeEaten();
}