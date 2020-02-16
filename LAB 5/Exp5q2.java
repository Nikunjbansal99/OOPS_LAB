interface A
{
   	public void method1();
	public void method2();
}

class MyClass implements A
{	
	public void method1()
  	 {
        		System.out.println("MTHD 1");
  	 }
	public void method2()
  	 {
        		System.out.println("MTHD 2");
  	 }

}
class Exp5q2
{
    	public static void main(String args[])
	{
		A obj = new MyClass();
		obj.method2();
		obj.method1();
   	 }
}