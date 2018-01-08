public class GameManager implements CharacterManager,UserInteractionManager {
	private String playername;
	private Character[] characters=new Character[100];
	private habitatmap[] habitatsList=new habitatmap[5];
	int nbr;
	
	public GameManager(String p){
		playername=p;
		nbr=0;
		habitatsList[0]=new habitatmap(0);
		habitatsList[1]=new habitatmap(1);
		habitatsList[2]=new habitatmap(2);
		habitatsList[3]=new habitatmap(3);
		habitatsList[4]=new habitatmap(4);
	}
	/* //UNUSED
	public void createNewWorld(String p) {
		playername=p;
		nbr=0;
		habitat[0]=new Habitat("sky",75,25,50,25);
		habitat[1]=new Habitat("earth",50,50,50,50);
		habitat[2]=new Habitat("beach",20,60,60,60);
		habitat[3]=new Habitat("mountain",30,60,30,60);
		habitat[4]=new Habitat("see",50,50,50,50);
	}
	*/

	public void loop() {
		int i=0;
		for(i=0; i<5; i++){
			generateEvents(habitatsList[i].ha); //ha = habitat of the habitatmap
		}

		i=0;
		for(i=0; i<100; i++){
			generateEvents(characters[i]);
		}
	}

	public void generateEvents(Character c) {
		int t = (int) (Math.random()*100 + (habitatsList[c.getHabitat()].ha.getTemp() - c.getTemp()));

		if(t<20){
			c.die();
		}else if(t>80){
			c.die();
		}else if(t<30){
			// MVC "Un <espece> est mort de froid"
		}else if(t>70){
			//MVC "Un <espece> est mort de chaud"
		}
		int h = (int) (Math.random()*100 + (habitatsList[c.getHabitat()].ha.getHumidity() - c.getHumidity()));

		if(h<20){
			c.die();
		}else if(h>80){
			c.die();
		}else if(h<30){
			// MVC "Un >espece> s'est déshydraté"
		}else if(h>70){
			//MVC "Un <espece> s'est noyé"
		}
		int s = (int) (Math.random()*100 + (habitatsList[c.getHabitat()].ha.getSleep() - c.getSleep()));

		if(s<20){
			c.die();
		}else if(s>80){
			c.die();
		}else if(s<30){
			// MVC "Un <espece> est mort de fatigue"
		}else if(s>70){
			//MVC "Un <espece> est mort dans son sommeil"
		}
		int e = (int) (Math.random()*100 + (habitatsList[c.getHabitat()].ha.getEnergy() - c.getEnergy()));

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

	public void generateEvents(Habitat h) {
		int i = (int) (Math.random() * 8);
		switch(i){
			case 0:
				if((h.getTemp() + 20) > 100){
					h.setTemp(100);
				}else{
					h.setTemp(h.getTemp() + 20);
				}
				//mvc "les radiateurs de <habitat> sont cassés"
				break;
			case 1:
				if((h.getTemp() - 20) < 0){
					h.setTemp(0);
				}else{
					h.setTemp(h.getTemp() - 20);
				}
				//mvc "un feu s'est déclaré dans <habitat>"
				break;
			case 2:
				if((h.getHumidity() + 20) > 100){
					h.setHumidity(100);
				}else{
					h.setHumidity(h.getHumidity() + 20);
				}
				//mvc "les canalisations sont bouchés, l'eau n'arrive plus à <habitat>"
				break;
			case 3:
				if((h.getHumidity() - 20) < 0){
					h.setHumidity(0);
				}else{
					h.setHumidity(h.getHumidity() - 20);
				}
				//mvc "une innondation s'est déclaré dans <habitat>"
				break;
			case 4:
				if((h.getSleep() + 20) > 100){
					h.setSleep(100);
				}else{
					h.setSleep(h.getSleep() + 20);
				}
				//mvc "la lumiere de <habitat> est cassé, personne ne se réveille"
				break;
			case 5:
				if((h.getSleep() - 20) < 0){
					h.setSleep(0);
				}else{
					h.setSleep(h.getSleep() - 20);
				}
				//mvc "les lumières de <habitat> ne s'éteigne plus, impossible de dormir"
				break;
			case 6:
				if((h.getEnergy() + 20) > 100){
					h.setEnergy(100);
				}else{
					h.setEnergy(h.getEnergy() + 20);
				}
				//mvc "on meurt de faim dans <habitat>"
				break;
			case 7:
				if((h.getEnergy() - 20) < 0){
					h.setEnergy(0);
				}else{
					h.setEnergy(h.getEnergy() - 20);
				}
				//mvc "trop de nourriture arrive à <habitat>, c'est du gaspillage
				break;
		}
	}

	public void move() {}//mvc
	public habitatmap[] getHabitatsMaps(){
		return habitatsList;
	};
	public void changeTemp(int h, int temp) {
		habitatsList[h].ha.setTemp(temp);
	}

	public void changeHumidity(int h, int humidity) { habitatsList[h].ha.setHumidity(humidity); }

	public void changeSleep(int h, int sleep) {habitatsList[h].ha.setSleep(sleep); }

	public void changeEnergy(int h, int energy) { habitatsList[h].ha.setEnergy(energy); }

	public void changeTemp() {}

	public void changeHumidity() {}

	public void changeSleep() {}

	public void changeEnergy() {}
	public void getCharacterBySpecies(Species spe) {}

	public void getCharacterByHabitats(Habitat h) {}

}