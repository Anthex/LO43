package cjj;

public class GameManager implements CharacterManager,UserInteractionManager,EventsManager{
	private string playername;
	private Character[] characters;
	private Habitat[5] habitat;
	
	public GameManager(string p){
		playername=p;
		habitat[0]=new Habitat("beach");
		habitat[1]=new Habitat("glaceland");
		habitat[2]=new Habitat("desert");
		habitat[3]=new Habitat("forest");
		habitat[4]=new Habitat("river");
	}
	public void createNewWorld(string p) {
		playername=p;
		habitat[0]=new Habitat("beach");
		habitat[1]=new Habitat("glaceland");
		habitat[2]=new Habitat("desert");
		habitat[3]=new Habitat("forest");
		habitat[4]=new Habitat("river");
	}
	public void populate() {}
	public void loop() {}
	public void generateEvents() {}
	public void move() {}
	
	
}
