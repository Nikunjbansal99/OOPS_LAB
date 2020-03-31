class NonNumrcExption extends Exception
{
	public NonNumrcExption(String s) 
	{
		super(s);
    	}
}

public class Exp7Q3 
{
	public static void main(String[] args) 
	{
       		 try 
		{
           			int variable = 0;
            			try 
			{
				variable = Integer.parseInt(args[0]);
            			}
			catch(NumberFormatException e) 
			{
                			throw new NonNumrcExption(e.toString());
            			}
            			System.out.println("Input Argument = " + variable);
       		 }
        		catch (NonNumrcExption e) 
		{
			System.out.println("Non numeric exception. Invalid Argument. Error message:\n" + e);
       		 }
   	 }
}
