package level_1.homeWork06_5_SortedChecker;

public class SortedChecker {
	public static void main(String[] args) {

		int [] arrayExampl1 = {-3, -1, 20, -2, 10, 0};
		int [] arrayExampl2 = {-3, -1, -20, -2, -10, 0};

		System.out.println(lastPositiveElem(arrayExampl1));
		System.out.println(lastPositiveElem(arrayExampl2));
	}

	public static int lastPositiveElem(int[] array) {
		int localSumm = 0;
		for (int number : array) {
			if (number >0) {
				localSumm = number;
			}
		}
		if(localSumm==0) {
			return Integer.MIN_VALUE;
		}
		return localSumm;
	}
}
