package level_0.homeWork06_06;

import java.util.Arrays;

public class SortByArray {
	public static void main(String[] args) {
		int[] arrayExampl = { 13, 11, 41, 1, 18, 10, 4 };
		System.out.println("Before sorting");
		for (int i = 0; i < arrayExampl.length; i++) {
			System.out.print( i + " = " + "[" + arrayExampl[i] + "]   ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("After sorting");
		Arrays.sort(arrayExampl);
		for (int i = 0; i < arrayExampl.length; i++) {
			System.out.print( i + " = " + "[" + arrayExampl[i] + "]   ");

		}
	}
}
