package Exercise;

public class Armstrong {
	// 153 =1^3+5^3+3^3=153

	public static void main(String[] args) {
		int num = 153, remainder, length = 0;
		int temp = num, arm = 0;
		int temp1 = num;
		while (num > 0) {
			length++;                // 
			num = num / 10;
		}
		System.out.println(length);
		//System.out.println(num);
		while (temp > 0) {
			remainder = temp % 10;
			arm = arm + (remainder * remainder * remainder);
			temp=temp/10;

		}
		if (temp1 == arm) {
			System.out.println("it is an armstrong number");
		} else {
			System.out.println("it is not an armstrong number");
		}

	}

}
