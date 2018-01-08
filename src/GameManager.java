public class GameManager implements CharacterManager,UserInteractionManager {
	private String playername;
	private Character[] characters=new Character[100];
	private Habitat[] habitat=new Habitat[5];
	int nbr;
	
	public GameManager(String p){
		playername=p;
		nbr=0;
		habitat[0]=new Habitat("sky",75,25,50,25);
		habitat[1]=new Habitat("earth",50,50,50,50);
		habitat[2]=new Habitat("beach",20,60,60,60);
		habitat[3]=new Habitat("mountain",30,60,30,60);
		habitat[4]=new Habitat("see",50,50,50,50);
	}
	public void createNewWorld(String p) {
		playername=p;
		nbr=0;
		habitat[0]=new Habitat("sky",75,25,50,25);
		habitat[1]=new Habitat("earth",50,50,50,50);
		habitat[2]=new Habitat("beach",20,60,60,60);
		habitat[3]=new Habitat("mountain",30,60,30,60);
		habitat[4]=new Habitat("see",50,50,50,50);
	}

	public void loop() {
		int i=0;
		for(i=0; i<100; i++){
			generateEvents(characters[i]);
		}
	}

	public void generateEvents(Character c) {
		int t = Math.random()*100 + (habitat[c.getHabitat()].getTemp() - c.getTemp();

		if(t<20){
			c.die();
		}else if(t>80){
			c.die();
		}else if(t<30){
			// MVC "Un <espece> est mort de froid"
		}else if(t>70){
			//MVC "Un <espece> est mort de chaud"
		}
		int h = Math.random()*100 + (habitat[c.getHabitat()].getHumidity() - c.getHumidity();

		if(h<20){
			c.die();
		}else if(h>80){
			c.die();
		}else if(h<30){
			// MVC "Un >espece> s'est déshydraté"
		}else if(h>70){
			//MVC "Un <espece> s'est noyé"
		}
		int s = Math.random()*100 + (habitat[c.getHabitat()].getSleep() - c.getSleep();

		if(s<20){
			c.die();
		}else if(s>80){
			c.die();
		}else if(s<30){
			// MVC "Un <espece> est mort de fatigue"
		}else if(s>70){
			//MVC "Un <espece> est mort dans son sommeil"
		}
		int e = Math.random()*100 + (habitat[c.getHabitat()].getEnergy() - c.getEnergy();

		if(e<20){
			c.die();
		}else if(e>80){
			c.die();
		}else if(e<30){
			// MVC "Un <espece> est mort de faim"
		}else if(e>70){
			//MVC "Un <espece> a fait une indigestion"
		}
	}

	public void move() {}//mvc

	public void changeTemp(int h, int temp) {
		habitat[h].setTemp(temp);
	}

	public void changeHumidity(int h, int humidity) { habitat[h].setHumidity(humidity); }

	public void changeSleep(int h, int sleep) { habitat[h].setSleep(sleep); }

	public void changeEnergy(int h, int energy) { habitat[h].setEnergy(energy); }

	public void changeTemp() {}

	public void changeHumidity() {}

	public void changeSleep() {}

	public void changeEnergy() {}

	public void generateEvents(Character[] c) {}

	public void getCharacterBySpecies(Species spe) {}

	public void getCharacterByHabitats(Habitat h) {}

}