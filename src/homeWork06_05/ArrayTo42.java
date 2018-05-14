package homeWork06_05;

import java.util.Arrays;

public class ArrayTo42 {
	public static void main(String[] args) {
		int Size = 5;
		int array[] = new int[Size];

		Arrays.fill(array, 42);
		System.out.println(Arrays.toString(array));

	}
}
