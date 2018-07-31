package harvest;

public class Cauli extends Harvest {
	public Cauli(int q){
		super(q);
		basePrice = 30;
		baseEnergy = 25;
	}

	@Override public String name(){
		return "Cauli";
	}
}
