import java.io.BufferedReader;


public class Main {
		
	public static void main(String[] args) {
	
	boolean quit = false;
	while(quit = false) {
	
	
				System.out.println(" Welcome to the Lawn Game Olympics!");	
				System.out.println("Please enter a command!");
	
	if (args[0].equals("Events") || args[0].equals("e")) {
		EventManager();
	}
	else if (args[0].equals("Olympians") || args[0].equals("o")) {
		OlympianManager();
	}
	else if (args[0].equals("help") || args[0].equals("h"))	{
		DisplayHelp();
	}
	else if (args[0].equals("quit") || args[0].equals("q")) {
		quit = true;
		System.out.println("Quitting Application");
	}
	else if (args[0].equals("teams") || args[0].equals("t")) {
		printTeams();
	

	
	
	}

		

	public static void EventManager(){
		EventManager event = new EventManager();
		event.printEvents();
	}
	
	public static void OlympianManager(){
		OlympianManager oly = new OlympianManager();
		oly.printOlympians();
	}

	public static void DisplayHelp(){
		System.out.println("Here is some help!");
	}
	
	public static void DisplayTeams(){
		TeamManager Team = new TeamManager();
		Team.printTeams();
	}



}
