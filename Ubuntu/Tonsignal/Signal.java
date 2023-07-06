class Signal {
	public static void main(String[] args ) {
		int signal[] = {1, 5, 4, 5, 7, 6, 8, 6, 5, 4};
		int sum = 0;
		int result[] = new int[signal.length];
		for(int i = 0; i < signal.length; i++) {
			if ((i-1) == -1) {
				sum = (signal[i] + signal[i+1])/2;
			} else if(i == (signal.length -1)) {
				sum = (signal[i] + signal[i-1])/2;
			} else {
				sum = (signal[i-1] + signal[i] + signal[i+1])/3;
			}
		result[i] = sum;
		}
		for(int j = 0; j < result.length; j++) {
			System.out.print(result[j] + ", ");
		}
		System.out.println();
	}
}

