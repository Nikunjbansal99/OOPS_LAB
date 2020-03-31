class AgeExption extends Exception 
{
	public AgeExption(String a) 
	{	
		super(a);
    	}
}

class NameExption extends Exception 
{
	public NameExption(String a) 
	{
        		super(a);
   	 }
}

class Emp
{
	private final String Name;
	private final int Age;
	public Emp(int Age, String Name) throws AgeExption, NameExption 
	{
		if(Age > 50) 
		{
			throw new AgeExption("Age > 50");
        		}
        		try 
		{
           			Integer.parseInt(Name);
            			throw new NameExption("Invalid Argument. Input Name is a number");
       		}
        		catch (NameExption e) 
		{
           			throw e;
        		}
        		catch(Exception e)
		{}
        		this.Age = Age;
        		this.Name = Name;
   	}
    
    	@Override
   	public String toString() 
	{
        		return "Age:- " + Age + "\tName:- " + Name;
   	}
}

public class Exp7Q5
{
	public static void main(String[] args) 
	{
		try 
		{
			Emp emp = new Emp(Integer.parseInt(args[0]), args[1]);
            			System.out.println("Employee was successfully Registered : " + emp);
        		}
        		catch(AgeExption e) 
		{
            			System.out.println("Age Exception thrown. Error message:\n" + e);
        		}
        		catch(NameExption e) 
		{
            			System.out.println("Name Exception thrown. Error message:\n" + e);
        		}
        		catch(Exception e) 
		{
            			System.out.println("Exception thrown. Error message:\n" + e);
        		}
    	}
}
