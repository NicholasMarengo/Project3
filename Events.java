
public abstract class Events {
	//public abstract class Events{
		
		public String name;
		public int playTo;
		public boolean isPlayToExact;
		public int playDistance;
		
		public abstract String getExtraInfo();
	
	public Events(String name, int playTo, boolean isPlayToExact, int playDistance){
		this.name = name;
		this.playTo = playTo;
		this.isPlayToExact = isPlayToExact;
		this.playDistance = playDistance;
	


	public String getEventInfo(){
		return this.name + "_" + this.playTo + "_" + this.isPlayToExact + "_" + this.playDistance + getExtraInfo + ".";
	
	}		

	}


	private void getEventInfo() {
		// TODO Auto-generated method stub
		
	}	
	
}	
