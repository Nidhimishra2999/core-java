package in.co.basics;

public class Simpleinterest {

	private int principal;
	private int rate;
	private float time;
	 
	public double getprincipal()
	{
		return principal;
	}
	public int getrate()
	{
		return rate;
	}
	public float gettime()
	{	
		return time;
	}
	public Simpleinterest(int principal,int rate,float time)
	{
		this.principal=principal;
		this.rate=rate;
		this.time=time;
	}
	
	
}
