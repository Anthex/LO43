package cjj;

public class Character {
	private int temp;
	private int humidity;
	private int life;
	private String name;
	private int x,y;
	private int age;
	public Character() {}
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
	public void Setlife() {
		this.life=life;
	}
	public String getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
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
}
