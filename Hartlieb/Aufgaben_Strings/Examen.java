
class Examen {
	public static String personalNumberFirst(String data) {
		String new_data;
		String[] result = data.split("\\|");
		new_data = result[2] + "|" + "|" + result[0] + "|" + result[1];
		return new_data;
	}
	public static void main(String[] args) {
		String test = "sCHNEIDER|mAX|fr_111|Heidelberg";
		String result = personalNumberFirst(test);
		System.out.println(test);
		System.out.println(result);

	}
}
