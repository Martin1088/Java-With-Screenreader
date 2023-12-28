class Equals {
	public static void main(String[] args) {
		String a = "Test Ausgabe";
	String[] result = a.split(" ");
	String two = result[0] + " " + result[1];
	System.out.println(a);
	System.out.println(two);
	if (a == two ) {
		System.out.println(" ist == ");
	}
	if (a.equals(two)) {
		System.out.println("ist equal ");
	}

	}
}

