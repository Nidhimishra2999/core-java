package in.co.polymorphism;

public class TestShapeP {

	public static void main(String[] args) {
		/*
		 * RectangleP r= new RectangleP(10,20); TriangleP t= new TriangleP(5,5); CircleP
		 * c= new CircleP(10);
		 * 
		 * System.out.println(r.area()); System.out.println(t.area());
		 * System.out.println(c.area())	;
		 */ 
		   
		   ShapeP[] s= new ShapeP[3];
		   s[0] = new RectangleP(10,20);
           s[1] = new TriangleP(20,22);
		   s[2] = new CircleP(10);
		    
		   double totalarea = 0;
		  // Object totalarea;
		for(int i=0; i<s.length; i++)
		   {
			   
			   totalarea = totalarea+ s[i].area();
		   }
		   
		   System.out.println(totalarea);
		   
		   
		   
		   
		   
				   

	}

}
