public class Habitat {
	private String name;
	private int upkeep=10;
	private int temp;
	private int humidity;
	private int sleep;
	private int energy;
	private int nbr;
	private Character [] chara=new Character[10];
	private Species [] se=new Species[2];
	
	public Habitat(String n,int t,int h, int s, int e){
		nbr=0;
		name=n;
		temp=t;
		humidity=h;
		sleep=s;
		energy=e;
		
	}
	public Habitat(int h) {
		nbr=0;
		switch(h) {
		case 0:
			name="sky";
			se[0]=Species.angel;
			se[1]=Species.human;
			temp=80;
			humidity=30;
			sleep=60;
			energy=30;
			break;
		case 1:
			name="earth";
			se[0]=Species.human;
			se[1]=Species.centaure;
			temp=50;
			humidity=50;
			sleep=50;
			energy=50;
			break;
		case 2:
			name="beach";
			se[0]=Species.centaure;
			se[1]=Species.mermaid;
			temp=20;
			humidity=60;
			sleep=60;
			energy=60;
			break;
		case 3:
			name="montain";
			se[0]=Species.centaure;
			se[1]=Species.angel;
			temp=30;
			humidity=60;
			sleep=30;
			energy=60;
			break;
		case 4:
			name="see";
			se[0]=Species.mermaid;
			se[1]=Species.human;
			temp=50;
			humidity=50;
			sleep=50;
			energy=50;
			break;
			
		}
	}

	public int getTemp() { return temp;}

	public int getHumidity() {return humidity;}

	public int getSleep() {return sleep;}

	public int getEnergy() {return energy;}

	public void setTemp(int t){ temp=t; }

	public void setHumidity(int h){humidity=h;}

	public void setSleep(int s){sleep=s;}

	public void setEnergy(int e){energy=e;}

	public void addchar(Character c){
	    chara[nbr]= c;
	    nbr++;
	}

	public String deletchara(Character c){
		String s;
	        if (nbr==0){
			s= "Il y n'a pas d'individus";
		}else{
			int n=nbr;
			for (int i=0; i<nbr; i++){
				if (chara[i]==c){
					for(int k=i; k<(nbr-1); k++)
					       chara[k]=chara[k+1];
				        nbr--;
					break;
			        }
			}
			if (n==nbr) s= "Il y n'a pas cet espèce";
			else 
		        s= "Success!";
		}
	        return s;
	}

	public Character getChara(int i){
		 return chara[i];
	}

	public int getNbr(){return nbr;}

	public void renew(Habitat h){
		name=h.name;
		nbr=h.nbr;
		for(int i=0;i<nbr;i++){
			chara[i].renew(h.chara[i]);
		}
	}

	public Species sep(int i) {
		return se[i];
	}

	public void setSp(int i,Species s) {
		se[i]=s;
		}

}
