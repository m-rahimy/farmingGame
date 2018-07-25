package harvest;

public abstract class Harvest {
	int quality;
	public Harvest(int quality){
		this.quality = quality;
	}

	public	void setQuality(int q){
		quality = q;
	}

}