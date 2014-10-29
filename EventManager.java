
public class EventManager {
	
		//initialize the EventManager class
		public EventManager(){
		
		Events[] eventList = new eventList[6];{
		this.eventList[0] = new CanJamEvent();
		this.eventList[1] = new CornHoleEvent();
		this.eventList[2] = new HorseShoesEvent();
		this.eventList[3] = new LadderBallEvent();
		this.eventList[4] = new StickGame(); 
		this.eventList[5] = new WashoosEvent(); 
		}
		
		}	
		public void printEvents() {
		
		for (int i=0; i<eventList.length; i++){
			System.out.println(eventList[i].getEventInfo());
		}
			
		} }
		
		

