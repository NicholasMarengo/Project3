
public class HorseShoesEvent {
	int numHorseshoes = 2;
	public HorseShoesEvent(String newName, int newPlayTo, boolean newIsPlayToExact, int newPlayDistance){
		super(newName, newPlayTo, newIsPlayToExact, newPlayDistance);
	}
	public HorseShoesEvent(){
		super("HorseShoes", 11, false, 40);
	}
	
	@Override public String getExtraInfo(){
		return "You play this with " + numHorseShoes + "horse shoes!";

	}
}