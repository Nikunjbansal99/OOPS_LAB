import java.io.*; 
  
class Exp8aQ1 
{ 
	public static void main (String[] args) 
 	{
    		String str = args[0]; 
 
    		int firstIndex = str.indexOf(args[1]); 
    		System.out.println("First occurrence of \"" + args[1] + "\" is found at : " + firstIndex); 
		if(firstIndex==-1)
			System.out.println(" \"" + args[1] + "\" is not found.");

   		int lastIndex = str.lastIndexOf(args[1]); 
    		System.out.println("Last occurrence of \""+ args[1] + "\" is found at : " + lastIndex); 
		if(lastIndex==-1)
			System.out.println(" \"" + args[1] + "\" is not found.");

	}
}