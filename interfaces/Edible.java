package interfaces;
import player.*;
import util.*;

public interface Edible {
	public Pair<Energy, Health> consume();
}