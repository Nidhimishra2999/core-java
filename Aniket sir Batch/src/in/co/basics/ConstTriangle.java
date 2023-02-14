package in.co.basics;

public class ConstTriangle 
{
   int height;//private is a access modifier
  int base;//int is a datatype
  
  public int getheight()
  {
	  return height;
  }
  public int getbase()
  {
	  return base;
	  
  }
  public ConstTriangle(int height,int base)
  {
	  this.base=base;
	  this.height=height;
  }
}
