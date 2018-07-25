class Main {
	public static void main(String[] args){
		System.out.println("hello");

		crop.Crop turnipCrop = new crop.Turnip();
		turnipCrop.grow();
		turnipCrop.grow();
		turnipCrop.grow();
		turnipCrop.grow();
		turnipCrop.grow();
		turnipCrop.grow();
		turnipCrop.grow();

		harvest.Turnip turnip = (harvest.Turnip) turnipCrop.harvest();

		turnip.consume();
		
	}
}