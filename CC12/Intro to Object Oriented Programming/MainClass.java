/**
  * CC 12 B
  */
  
class MainClass {

	public static void main(String args[]) {
	
		// instantiate a class 
		Speaker spkr1 = new Speaker();
		Speaker spkr2 = new Speaker("yellow");
		
		System.out.println("Speaker 1 color is : " + spkr1.color);
		System.out.println("Speaker 2 color is : " + spkr2.color);
		
		System.out.println("Speaker 1 power is : " + spkr1.state);
		System.out.println("Speaker 2 power is : " + spkr2.state);
		
		System.out.println("Speaker 1 volume is : " + spkr1.increase_volume());
		System.out.println("Speaker 1 volume is : " + spkr1.increase_volume());
		System.out.println("Speaker 1 volume is : " + spkr1.increase_volume());
	}	
}
