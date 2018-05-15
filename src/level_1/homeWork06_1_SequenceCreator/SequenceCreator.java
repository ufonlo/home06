package level_1.homeWork06_1_SequenceCreator;

import java.util.Arrays;
import java.util.Scanner;

public class SequenceCreator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array long for 0...n");
		int sizeArray = scan.nextInt();
		scan.close();
		System.out.println(Arrays.toString(createSequence(sizeArray)));
	}
		

	public static int[] createSequence(int sizeArray) {
		if (sizeArray < 0) {
			throw new IllegalArgumentException();
		}
		int array[] = new int[sizeArray];
		for (int index = 0; index < sizeArray; index++) {
			array[index] = index;
		}
		return array;
	}

}
