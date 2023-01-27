package in.co.inheritance;

public class TestSRTC {

	public static void main(String[] args)
	{
		ShapeRectangle sr= new ShapeRectangle();
		ShapeTriangle st= new ShapeTriangle();
		ShapeCircle sc= new ShapeCircle();
		 
		sr.setLength(20);
		System.out.println(sr.getLength());
		
		st.setHeight(40);
		st.setBase(20);
		System.out.println(st.getHeight()* st.getHeight());
		
		
		
		

	}

}
