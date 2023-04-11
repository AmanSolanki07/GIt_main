class MethodOverLoadingTest
{
	public int add(int a, int b)
	{
		return a+b;
	}
	public int add(int a, int b, int c)
	{
	 return a+b+c;
	}	
}
class MethodOverridingTest
{
	public int add(int a, int b,int c)
	{
		return (a+b)*c;
	}
}
class Main
{
	public static void main(String args[])
	{
		MethodOverLoadingTest a = new MethodOverLoadingTest();
		MethodOverridingTest a1 = new MethodOverridingTest();
		System.out.println(a.add(10, 4));
		System.out.println(a.add(5, 2, 3));
		System.out.println(a1.add(5, 2, 5));
	}
}