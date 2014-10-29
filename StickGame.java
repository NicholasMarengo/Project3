
public class StickGame extends Events {
	private int frisbeesize = 5;
	public StickGame(String name, int playTo, boolean isPlayToExact, int playDistance){
	super (name, playTo, isPlayToExact, playDistance);
	}
	
	public StickGame(){
		super ("StickGame", 11, false, 25);
	}


	@Override public String getExtraInfo(){
		return "_has a frisbee size of 5";

}
}