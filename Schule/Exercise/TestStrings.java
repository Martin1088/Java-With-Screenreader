class TestStrings{
	public static void main(String[] args){
		String addresse = "www.thermomix.de";
		System.out.println(addresse.charAt(3));
		System.out.println(addresse.indexOf(3));
		addresse = addresse.replace('w', 's').replace('s', 'y');
		System.out.println(addresse);
		for(int i = 0; i <= addresse.length(); i++) {
			System.out.println(addresse.charAt(i));
		}
	}
}
