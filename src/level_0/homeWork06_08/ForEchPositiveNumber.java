package level_0.homeWork06_08;

public class ForEchPositiveNumber {
	public static void main(String[] args) {
		int[] arrayExampl = { 13, -11, 41, 1, 18, -10, 4 };
		System.out.println("Number Array");
		for (int index:arrayExampl) {
			System.out.print(index + " ");
		}
		System.out.println();
		System.out.println();

		System.out.println("positive numbers");
		
		for (int index:arrayExampl) {
			if (index >= 0) {
				System.out.print(index  + "  ");
			}
		}
	}

}
