package in.co.java8;

public class TestInter1 {
	public static void main(String[] args) {
		Inter1 t = (a, b) -> {
			return a + b;

		};

		int t1 = t.add(20, 40);
		System.out.println(t);

		Inter1 t2 = (a, b) -> {
			return a - b;

		};
		
		int a= t2.add(20, 30);
		System.out.println(a);
		Inter1.Static();
		t.defmethod();
		

	}
}
