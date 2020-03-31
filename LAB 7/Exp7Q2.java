import java.util.*;  
class Exp7Q2
{
	public static void main(String args[])
	{
		int a,b,R;
		Scanner sc= new Scanner(System.in);   
		System.out.print("Enter Numerator: ");  
		a= sc.nextInt();  
		System.out.print("Enter Denominator: ");  
		b= sc.nextInt();  
		try
		{
			R =a/b;
			System.out.println("Result Of Division:"+ R );
		}
		catch(ArithmeticException e)
		{
			System.out.println(" Invalid Denominator. Division by zero "); 
		}
		catch(Exception e)
		{	
			System.out.println(e);
		}
		
	}
}
