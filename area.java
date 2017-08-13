package area;

public class area 
{
	void rect()
	{
		int l=10;
		int b=5;
		System.out.println("AREA OF RECTANGLE="+(l*b));
	}
	void triangle(int b,int h)
	{
		System.out.println("AREA OF TRIANGLE="+(0.5*b*h));
	}
	int square()
	{
		int s=5;
		return s*s;
	}
	double circle(int r)
	{
		return 3.14*r;
	}
	public static void main(String[] args)
	{
		area a = new area();
		a.rect();
		a.triangle(5,6);
		System.out.println("AREA OF SQUARE="+a.square());
		System.out.println("AREA OF CIRCLE="+a.circle(3));
		
	}

}
