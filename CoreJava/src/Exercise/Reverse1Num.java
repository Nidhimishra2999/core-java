package Exercise;

public class Reverse1Num {

	public static void main(String[] args) {
		int num = 987;
		int reverse = 0, i;
		int lastdigit;

		while (num > 0) {
			i = num % 10;
			reverse = reverse * 10 + i;
			num = num / 10;

		}
		System.out.println(reverse);
	}
}
