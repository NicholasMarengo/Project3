import java.util.*;


public class TeamManager {
		private int teams;
		private Olympian[] managerArray;
		private int teamSize;
		private Team[] teamArray = new Team[14];
		private int current = 0;
		
		
		public TeamManager() {
			for(int i = 0; i < teamArray.length; i++) {
				teamArray[i] = new Team();
			}
			
			OlympianManager OM = new OlympianManager();
			managerArray = OM.getObjectOlympians();
			teamSize = managerArray.length / 2;
			int totalTeamSize = managerArray.length;
			
			while(totalTeamSize != 0) {
				Random rn = new Random();
				int random1 = rn.nextInt(14) + 1;
				int random2 = rn.nextInt(14) + 1;
			
			
				if(managerArray[random1] !=null && managerArray[random2] != null) {
					teamArray[current].SetInfo(managerArray[random1], managerArray[random2], 0, 0);
					
					current++;
					if(random1 == random2) {
						current--;
					}else if(random1 == Sex.M) {
					
					}else{
						managerArray[random1] = null;
						managerArray[random2] = null;
						totalTeamSize = totalTeamSize - 2;
					}
				}
			
			}
			
			
			
			
		}
		
	public Team[] getTeamArray(){
		return this.teamArray;
	}
	
	public void printTeams(){
		
	}
		
		
		
		
		
		
}