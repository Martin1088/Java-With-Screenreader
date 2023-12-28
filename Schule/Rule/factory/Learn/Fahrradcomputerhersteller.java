package Factory;

public class Fahrradcomputerhersteller {
	
	public static Fahrradcomputer 
		produziereComputer(Eigenschaft eigenschaft) {
		
		switch(eigenschaft) {
		case GPS:
			return new Gps_Computer();
		case KABELLOS:
			return new Kabellos_Computer();
		case KINDER:
			return new Easy_Computer();
		default:
			return null;
		}
	}

}
