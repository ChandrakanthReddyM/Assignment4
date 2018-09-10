package assignment4;

public class MuliplicationMethodOverloading {
	public static int mul(int a,int b)
	{
		return a*b;
	}
	public static int mul(int a,int b,int c)
	{
		return a*b*c;
	}
	public static double mul(double a,double b)
	{
		return a*b;
	}
		public static void main(String[] args) {
			int a=mul(20,19);
			int b=mul(20,9,10);
			double c=mul(20.7,9.8);
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);

	}
}
