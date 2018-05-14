package homeWork06_Method_3;

public class RealizationForMethod {
	public static void main(String[] args) {
		System.out.print(lastChar("Bender"));
	}

	public static char lastChar(String c) {
		if (c.length() == 0) {
			throw new IllegalArgumentException();
		}
		return c.charAt(c.length() - 1);
	}

}
