public class Character {
	private int temp;
	private int humidity;
	private int sleep;
	private int energy;
	private int x,y;
	private int age;
	private Species sp;
	private int ha;
	
	public void renew(Character c){
		temp=c.temp;
		humidity=c.humidity;
		sleep=c.sleep;
		energy=c.energy;
		age=c.age;
		x=c.x;
		y=c.y;
		sp=c.sp;
		ha=c.ha;
	}
	public Character(){
		int j = (int) (Math.random() * 3);
		switch (j){
			case 0:
				int i = (int) (Math.random() * 4);
				this.renew(new Character(75,25,50,25,Species.angel,i));
				break;
			case 1:
				int i = (int) (Math.random() * 4);
				this.renew(new Character(50,50,50,50,Species.human,i));
				break;
			case 2:
				int i = (int) (Math.random() * 4);
				this.renew(new Character(25,75,75,75,Species.centaure,i));
				break;
			case 3:
				int i = (int) (Math.random() * 4);
				this.renew(new Character(75,25,25,50,Species.mermaid,i));
				break;
		}
	}


	public Character(int t,int h,int s,int e,Species sp2,int h2){
		temp=t;
		humidity=h;
		sleep=s;
		energy=e;
		sp=sp2;
		ha=h2;
	}

	public Character(int t,int h,int s, int e,Species sp2){
		temp=t;
		humidity=h;
		sleep=s;
		energy=e;
		sp=sp2;
	}
	public Character(Species s) {
		Species expression = s;
		switch(expression){
                   case angel:
                this.renew(new Character(75,25,50,25,s));
				break;
                   case human:
                       this.renew(new Character(50,50,50,50,s));
       			break;
                   case centaure:
                       this.renew(new Character(25,75,75,75,s));
       			break;
                   case mermaid:
                       this.renew(new Character(75,25,25,50,s));
              	break;
		}
	}
	public void die() {} //MVC

	public void move(int x,int y) {} //MVC

	public int getTemp() {
	        return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public int getHumidity() {
	       return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public int getSleep() {
		return sleep;
	}

	public void setSleep(int l) {
		this.sleep=l;
	}

	public int getEnergy() { return energy; }

	public int getHabitat() { return ha;}

	public void setEnergy(int energy) { this.energy = energy; }

	public int getX() {
	        return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
	        return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getAge() {
	        return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Species getSp() {
		return sp;
	}

	public void setHabitat(int h) {
		ha=h;
	}

}
