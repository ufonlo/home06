package level_0.homeWork06_Method_4;

public class RealizationForMethod {
	public static void main(String[] args) {
		System.out.print(rangeSum(5, 10));
	}

	public static int rangeSum(int from, int to) {
		if (from > to) {
			throw new IllegalArgumentException();
		}
		int sum = 0;
		for (int i = from; i <= to; i++) {
			sum += i;
		}
		return sum;
	}
}
