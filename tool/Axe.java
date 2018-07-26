package tool;

public class Axe extends Tool {
	
	public Axe(){
		super();
	}

	@Override public void test(){
		System.out.println("Axe test() called");
	}

	@Override public String name(){
		return "Axe";
	}

	@Override public boolean canBeMultiple(){
		return false;
	}	
}