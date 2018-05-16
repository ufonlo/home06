package level_1.homeWork06_3_ArrayAverageCalculator;

public class ArrayAverageCalculator {
	public static void main(String[] args) {

		int [] arrayExampl1 = { 5, 2, 10 };

		int[] arrayExampl2 = {11};
		System.out.println(arrayPositive(arrayExampl1));
		System.out.println(arrayPositive(arrayExampl2));
	}

	public static int arrayPositive(int[] array) {
		if (array.length <= 0) {
			throw new IllegalArgumentException("Eror Array <= 0");
		}
		int localSumm = 0;
		int localIndex = 0;
		for (int number : array) {
			localSumm += number;
			localIndex++;
		}
		return localSumm / localIndex;
	}
}
