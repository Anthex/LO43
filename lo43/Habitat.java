package lo43;

public class Habitat {
	private String name;
	private int upkeep;
	private int temp;
	private int humidity;
	private int dimX;
	private int dimY;
	private int posX;
	private int posY;
	private int nbr;
	private Character [] chara;
	
	public Habitat(String n,int t,int h){
		nbr=0;
		name=n;
		temp=t;
		humidity=h;
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

}
