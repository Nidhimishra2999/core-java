package Exercise;

public class Palindrome {

	public static void main(String[] args) {
		int num = 1821;
		int i;
		int sum = 0;
		int temp = num;

		while (num > 0) {
			i = num % 10;
			sum = (sum * 10) + i;
			num = num / 10;
		}
		if (temp == num)

			System.out.println("This is a palindrome number");

		else

			System.out.println("This is not a palindrome number");
	}
}
