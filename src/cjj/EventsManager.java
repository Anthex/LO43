package cjj;

public interface EventsManager {
	
	public void changeTemp() {}
	public void changeHumidity() {}
	public void generateEvents(Character[] c) {}
	public void generateEvents() {}
	
	public int getProbabilityTemp() {
	        return probabilityTemp;
	}
	public void setProbabilityTemp(int probabilityTemp) {
                this.probabilityTemp = probabilityTemp;
	}
	public int getProbabilityHumidity() {
	        return ProbabilityHumidity;
	}
	public void setProbabilityHumidity(int probabilityHumidity) {
                this.probabilityHumidity = probabilityHumidity;
	}
	
	
}
