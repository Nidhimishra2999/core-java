package Exercise10;

public class TestPropagation {

	public static void main(String[] args) throws Exception   {
		first1();
		second1();
	}
		public static void first1() {
			try {
				second1();
			} catch (Exception e) {
				System.out.println("call the wrong one");
				
			}
		}
			 public static void second1() throws Exception{
				  System.out.println("call the second ");
				 
			}
		
			 {
				 
			
		}
		
		
		
		
		
	

	private static void second() {
		// TODO Auto-generated method stub
		
	}

	private static void first() {
		// TODO Auto-generated method stub
		
	}
}
