package level_1.homeWork06_2_ArrayPositivesCounter;

public class ArrayPositivesCounter {
	public static void main(String[] args) {

		int[] arrayExampl1 = { -3, 0, -1, 4, -2, 5 };
		int[] arrayExampl2 = { -3, 0, -1, -4, -2, -5 };
		int[] arrayExampl3 = {};
		System.out.println(arrayPositive(arrayExampl1));
		System.out.println(arrayPositive(arrayExampl2));
		System.out.println(arrayPositive(arrayExampl3));
		
		
	}

	public static int arrayPositive(int[] array) {
		int positiveNumberSumm = 0;
		for (int numberPositive : array) {
			if (numberPositive > 0) {
				positiveNumberSumm++;
			}
		}
		return positiveNumberSumm;
	}
}
