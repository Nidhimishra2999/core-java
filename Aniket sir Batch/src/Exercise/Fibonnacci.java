package Exercise;

public class Fibonnacci {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1; // 0 1 1 2 3 5 8
		int n3;
		int i;

		System.out.println(n1); // 0 1 
		System.out.println(n2);

		for (i = 1; i < 10; ++i) { //1

			n3 = n1 + n2;// 0+1=1 ,1+1=2 , 
			System.out.println(n3);// 0 1 1 2
			n1 = n2; // 1
			n2 = n3; //2
		}

	}
}
