/**
  * CC 12 B 
  */
  
class Speaker {

	// attributes
	String color;
	int weight;
	String shape;
	int state; 		// on/off 0=off, 1=on
	int volume;		
	
	// default constructor 
	public Speaker() {
		
		int temp;
		this.color = "pink";
		this.weight = 100;
		this.shape = "cube";
		this.state = 1;
		this.volume = 10;
	}	
	
	public Speaker(String col) {
		
		this.color = col;
		this.weight = 100;
		this.shape = "cube";
		this.state = 1;
		this.volume = 10;
	}
	
	public Speaker(String color, int state) {
		
		this.color = color;
		this.weight = 100;
		this.shape = "cube";
		this.state = state;
		this.volume = 10;
	}
	
	// turning on
	public void power_on() {
		this.state = 1;
	}
	// turning off
	public void power_off() {
		this.state = 0;
	}
	
	// increase volume 
	public int increase_volume() {
		this.volume++;
		return this.volume;
	}	
	
	// decrease volume 
	public int decrease_volume() {
		this.volume--;
		return this.volume;
	}

}