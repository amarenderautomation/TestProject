package inheritpgms;

public class One 
{
	//single inheritance
	public void printA()
	{
		System.out.println("A");
	}
}

class Two extends One
{
	public void printA(int a)
	{
		System.out.print("B");
		System.out.println(a);
	}
}

class Three extends Two
{
	public void printB()
	{
		System.out.println("C");
	}
}