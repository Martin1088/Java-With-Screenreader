class Length_test {
	public static void main(String[] args) {
		String test = "Dampfschifffahrgesellschaft";
		char t = test.charAt(test.length() - test.indexOf("fff"));
		System.out.println(test);
		System.out.println(t);
		System.out.println(test.indexOf("x"));
		System.out.println(test.startsWith("Dam"));
	}
}
