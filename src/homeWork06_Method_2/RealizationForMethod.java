package homeWork06_Method_2;

import java.util.Scanner;

public class RealizationForMethod {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Age");
		int ageOfHuman = scan.nextInt();
		scan.close();
		System.out.print(ageOfHuman(ageOfHuman));

	}

	public static boolean ageOfHuman(int i) {

		return i <= 120 && i > 0;

	}
}
