public class Habitat {
	private String name;
	private int upkeep=10;
	private int temp;
	private int humidity;
	private int nbr;
	private Character [] chara=new Character[10];
	private Species [] se=new Species[2];
	
	public Habitat(String n,int t,int h){
		nbr=0;
		name=n;
		temp=t;
		humidity=h;
		
	}
	public Habitat(int h) {
		nbr=0;
		temp=0;
		humidity=0;
		switch(h) {
		case 0:
			name="river";
			se[0]=Species.turtle;
			se[1]=Species.fish;
			break;
		case 1:
			name="glaceland";
			se[0]=Species.lion;
			se[1]=Species.dog;
			break;
		case 2:
			name="desert";
			se[0]=Species.camel;
			se[1]=Species.snake;
			break;
		case 3:
			name="forest";
			se[0]=Species.cat;
			se[1]=Species.tiger;
			break;
		case 4:
			name="beach";
			se[0]=Species.shell;
			se[1]=Species.starfish;
			break;
			
		}
	}
	public int getTemp() { return temp;}
	public int getHumidity() {return humidity;}
	public void settemp(int t){ temp=t; }
	public void sethumidity(int h){humidity=h;}
	public void addchar(Character c){
	    chara[nbr]= c;
	    nbr++;
	}
	public String deletchara(Character c){
		String s;
	        if (nbr==0){
			s= "Il y n'a pas d'animal";
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
			if (n==nbr) s= "Il y n'a pas cet animal";
			else 
		        s= "Success!";
		}
	        return s;
	}
	public Character getchara(int i){
		 return chara[i];
	}
	public int getnbr(){return nbr;}
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
	public void setsp(int i,Species s) {
		se[i]=s;
		}

}
