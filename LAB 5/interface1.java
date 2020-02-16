interface xyz
{ 
	public void f1();
}
interface abc
{
	public void f1();
	public void f2();
	public void f4();
}


class A  implements xyz
{
	public void f1()
	{ System.out.println("Inside f1 class A");} 
	public void f2()
	{ System.out.println("Inside f2 class A");} 
}
class B  implements xyz
{
	public void f1()
	{ System.out.println("Inside f1 class B");} 
	public void f4()
	{ System.out.println("Inside f4 class B");} 
}
class C extends A implements abc
{
	public void f1()
	{ System.out.println("Inside f1 class C");} 
	public void f2()
	{ System.out.println("Inside f2 class C");} 
	public void f4()
	{ System.out.println("Inside f4 class C");} 
}

class interface1
{
	public static void main(String args[])
	{
		xyz obj=new C();
		xyz obj1 = new A();
		System.out.println(obj1 instanceof A);
		System.out.println(obj instanceof xyz);		
	}
}