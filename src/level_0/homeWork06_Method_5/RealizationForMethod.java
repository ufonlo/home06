package level_0.homeWork06_Method_5;

public class RealizationForMethod {
	public static void main(String[] args) {
		message(5,20);
	}

	public static void message(int from, int to) {
		if (from > to) {
			throw new IllegalArgumentException();
		}

		for (int i = from; i <= to; i++) {
			if (i%2==0) {
				System.out.print(i + " ");
			}
		}
		
	}
}
