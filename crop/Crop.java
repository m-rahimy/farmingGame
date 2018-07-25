package crop;
import harvest.Harvest;
public abstract class Crop {

	int stage;
	int maxStage = 10;
	boolean isRipe = false;
	boolean hasFruit;
	private Harvest harvest;
	public Crop(int maxStage, boolean hasFruit, Harvest harvest){
		this.maxStage = maxStage;
		this.hasFruit =hasFruit ;
		this.harvest = harvest;
	}
	public void grow(){
		stage++;
		if (stage>maxStage) {
			stage = maxStage;
			ripe();
		}
		System.out.println("grow to stage " + stage);
	}

	private void ripe(){
		if(hasFruit){
			isRipe= true;
		}
		System.out.println("is ripe? " + isRipe);
	}

	public Harvest harvest(){
		if(!hasFruit) throw new RuntimeException("Does Not Have Friute");
		if(isRipe){
			harvest.setQuality(1);
			return harvest;
		} else throw new RuntimeException("Not Ripe");
	}
}