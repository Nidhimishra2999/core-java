package Exercise;

public class ReverseNumber {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("1621");
	StringBuffer b=sb.reverse();
		//System.out.println(sb.reverse());
		System.out.println(sb);
		System.out.println(b);
		if(sb==b)
		{
			System.out.println("paliondrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
		

	}

}
