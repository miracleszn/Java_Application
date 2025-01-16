// enums are used to store collection on constants, 
public class TrafficLightState{
	public static void main(String[] args){
		enum TrafficLight{RED,YELLOW,GREEN;}
		
		TrafficLight currentLight = TrafficLight.RED;
		
		switch (currentLight)
		{
			case RED:
				System.out.println("Stop");
			break;
			case YELLOW:
				System.out.println("Prepare to stop");
			break;
			case GREEN:
				System.out.println("Go");
			break;
		}
		
	}
}