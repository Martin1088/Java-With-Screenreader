package Factory;

public class Fahrradshop {

	public static void main(String[] args) {
		
		// es sollen 3 Computer gefertigt werden...
		Fahrradcomputer fc1 = 
				Fahrradcomputerhersteller.produziereComputer(Eigenschaft.KINDER);
		Fahrradcomputer fc2 = 
				Fahrradcomputerhersteller.produziereComputer(Eigenschaft.KABELLOS);
		Fahrradcomputer fc3 = 
				Fahrradcomputerhersteller.produziereComputer(Eigenschaft.GPS);
		
		System.out.println(fc1.info());
		System.out.println(fc2.info());
		System.out.println(fc3.info());


	}

}
