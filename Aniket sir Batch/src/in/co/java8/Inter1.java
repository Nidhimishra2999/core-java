package in.co.java8;
@FunctionalInterface

public interface Inter1 {
	
	public int add(int a,int b);
	
	public default void defmethod() {
		System.out.println("i am default method");
	}
	
	public static void Static() {
		System.out.println("i am static method");
	}
	
	
	
	

}
