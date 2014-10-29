
public class LadderBallEvent {
	private int numRings = 6;
	public LadderBallEvent(String name, int playTo, boolean isPlayToExact, int playDistance){
	super (name, playTo, isPlayToExact, playDistance);
	}
	
	public LadderBallEvent(){
		super("LadderBall", 21, true, 15);
	}

	@Override public String getExtraInfo(){
		return "_has 6 rings";

}
}