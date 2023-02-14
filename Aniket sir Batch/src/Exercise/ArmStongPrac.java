package Exercise;

public class ArmStongPrac {

	public static void main(String[] args) {
		int num = 132, temp=num, temp1=num, arm = 0;
		int remainder = 0;
		//int length = 0;

		while (num > 0) {
			remainder = temp % 10;
			temp = arm + (remainder * remainder * remainder);
			temp=temp/10;
		}
		if (temp1 == 0) {
			System.out.println("An armstrom number");
		} else {
			System.out.println("not An amstrom number");
		}

	}
}
