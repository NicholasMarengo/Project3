
public class CanJamEvents extends Events {
	
	int frisbeeSize = 6;
		public CanJamEvent(String name, int playTo, boolean isPlayToExact, int playDistance){
			super (name, playTo, isPlayToExact, playDistance);
		}
		
		public CanJamEvent(){
			super("CanJam", 21, true, 50);
		}
		
		@Override public String getExtraInfo(){
			return " has a frisbee size of 6 inches";
		}
	

}



