package Exercise;

public class QuestionNo12 {// palindrome number- 1221

	public static void main(String[] args) {
		int num = 1221;
		int i;
		int temp = num;
		int sum = 0;
		while (num > 0) {
			i = num % 10;
			sum = sum * 10 + i;
			// num = num/10;
		}
		if (temp == 0) 
			System.out.println("Palindrome number");

		 else
			System.out.println("not a palindrome number");

	}
}
