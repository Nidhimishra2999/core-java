package Exercise;

public class Question7 {

	public static void main(String[] args) {
		double add = 0, i;

		for (i = 100; i <= 200; i++) {
			if (i % 7 == 0) {
				add = add + i;
			}
		}
		System.out.println(add);

	}
}
