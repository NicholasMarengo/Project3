
public class HorseShoesEvent {
	int numHorseshoes = 2;
	public HorseShoesEvent(String name, int playTo, boolean isPlayToExact, int playDistance){
		super(name, playTo, isPlayToExact, playDistance);
	}
	public HorseShoesEvent(){
		super("HorseShoes", 11, false, 40);
	}
	
	@Override public String getExtraInfo(){
		return("_has 2 horseshoes");

}
}