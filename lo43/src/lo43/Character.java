package lo43;

public class Character {
	private int temp;
	private int humidity;
	private int life;
	private String name;
	private int x,y;
	private int age;
	private Species s;
	private int ha;
	
	public void renew(Character c){
		temp=c.temp;
		humidity=c.humidity;
		life=c.life;
		name=c.name;
		age=c.age;
		x=c.x;
		y=c.y;
		s=c.s;
		ha=c.ha;
	}
	public Character(int t,int h,int l,String n,Species sp,int h2){
		temp=t;
		humidity=h;
		life=l;
		name=n;
		s=sp;
		ha=h2;
	}
	public Character(int t,int h,int l,Species sp){
		temp=t;
		humidity=h;
		life=l;
		s=sp;
	}
	public Character(Species s) {
		Species expression = s;
		switch(expression){
                   case dog:
                this.renew(new Character(30,10,0,s));
				break;
                   case cat:
                       this.renew(new Character(30,10,0,s));
       			break;
                   case fish:
                       this.renew(new Character(10,80,0,s));
       			break;
                   case shell:
                       this.renew(new Character(10,80,0,s));
              	break;
                   case starfish:
                       this.renew(new Character(10,80,0,s));
                break;
                   case turtle:
                       this.renew(new Character(10,80,0,s));
                break;
                   case lion:
                       this.renew(new Character(20,10,0,s));
                break;
                   case tiger:
                       this.renew(new Character(20,10,0,s));
                break;
                case camel:
                       this.renew(new Character(40,5,0,s));
                break;
                case snake:
                      this.renew(new Character(40,5,0,s));
                break;
          
		}
	}
	public void die() {}
	public void move(int x,int y) {}
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
	public int getLife() {
		return life;
	}
	public void Setlife(int l) {
		this.life=l;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		this.name = n;
	}
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
	public Species getsp() {
		return s;
	}
	public void sethabitat(int h) {
		ha=h;
	}

}
