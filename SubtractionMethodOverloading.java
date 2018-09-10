package assignment4;

public class SubtractionMethodOverloading {
	public static int sub(int a,int b)
	{
		return a-b;
	}
	public static int sub(int a,int b,int c)
	{
		return a-b-c;
	}
	public static double sub(double a,double b)
	{
		return a-b;
	}
		public static void main(String[] args) {
			int a=sub(20,19);
			int b=sub(20,9,10);
			double c=sub(20.7,9.8);
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);

	}
	}
