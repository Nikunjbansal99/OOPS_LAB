public class Exp7Q4 
{
	public static void main(String[] args)
	{
		if((args[0].equals("Left") || args[0].equals("Right")) && (args[1].equals("Left") || args[1].equals("Right"))) 
		{
			
            		}
        		else 
		{
            			throw new RuntimeException("Invalid Arguments. args[0] and args[1] either Left or Right");
        		}
       		System.out.println("Vehicle 1 Direction = " + args[0]);
        		System.out.println("Vehicle 2 Direction = " + args[1]);
        		try 
		{
            			if(!args[0].equals(args[1])) 
			{
                			throw new Exception("As Vehicles Direction Different. Collision Avoided");
           			}
           			 System.out.println("As Vehicles Direction Same. Safe Journey. No collision");
        		}
        		catch (Exception e) 
		{
           			 System.out.println("Error message:\n" + e);
        		}
	}
}
