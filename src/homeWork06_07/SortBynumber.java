package homeWork06_07;

public class SortBynumber {
	public static void main(String[] args) {
		int[] arrayExampl = { 13, -11, 41, 1, 18, -10, 4 };
		System.out.println("Number Array");
		for (int i = 0; i < arrayExampl.length; i++) {
			System.out.print(arrayExampl[i] + "   ");
		}
		System.out.println();
		System.out.println();

		System.out.println("positive numbers");
		
		for (int i = 0; i < arrayExampl.length; i++) {
			if (arrayExampl[i] >= 0) {
				System.out.print(i  + "  ");
			}
		}
	}

}
