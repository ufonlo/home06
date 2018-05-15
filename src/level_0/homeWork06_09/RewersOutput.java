package level_0.homeWork06_09;

public class RewersOutput {
	public static void main(String[] args) {
		int[] arrayExampl = { 13, -11, 41, 1, 18, -10, 4 };
		System.out.println("Number Array");
		for (int index : arrayExampl) {
			System.out.print(index + " ");
		}
		System.out.println();
		System.out.println();

		System.out.println("revers output");

		for (int i = arrayExampl.length - 1; i >= 0; i--) {
			if (arrayExampl[i] > 0) {
				System.out.print(arrayExampl[i] + " ");
			}
		}
	}

}
