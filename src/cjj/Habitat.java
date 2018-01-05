package cjj;

public class Habitat {
	private string name;
	private int upkeep;
	private int temp;
	private int humidity;
	private int dimX;
	private int dimY;
	private int posX;
	private int posY;
	private int nbr;
	private Character [] chara;
	
	public Habitat(string n){
		nrb=0;
		name=n;
	}
	public int getTemp() { return temp;}
	public int getHumidity() {return humidity;}
	public void settemp(int t){ temp=t; }
	public void sethumidity(int h){humidity=h;}
	public void addchar(Character c){
	    chara[nbr]= c;
	    nbr++;
	}
	public string deletchara(Character c){
	        if (chara==NULL){
			return ("Il y n'a pas d'animal");
		}else{
			int n=nbr;
			for (int i=0; i<nbr; i++){
				if (chara[i]==c){
					for(int k=i; k<(nbr-1); k++)
					       chara[k]=chara[k+1];
				        nbr--;
				        return("Success!");
					break;
			        }
			}
			if (n==nbr) return("Il y n'a pas cet animal")
		}
	}
	public Character getchara(int i){
		if(i<=nbr) return chara[i];
	}
	public int getnbr(){return nbr;}
}
