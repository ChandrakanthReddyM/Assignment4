package assignment4;

public class AdditionMethodOverloading {
public static int add(int a,int b)
{
	return a+b;
}
public static int add(int a,int b,int c)
{
	return a+b+c;
}
public static double add(double a,double b)
{
	return a+b;
}
	public static void main(String[] args) {
		int a=add(20,19);
		int b=add(20,19,10);
		double c=add(20.7,19.8);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

}
}
