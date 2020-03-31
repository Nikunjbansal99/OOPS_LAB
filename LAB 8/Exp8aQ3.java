import java.io.*; 
class Exp8aQ3
{
	public static void main(String args[]) throws IOException
	{
		DataInputStream in=new DataInputStream(System.in); 
		System.out.print("Input Statement:");
		String statement=in.readLine();
		System.out.print("Modified Statement:" + statement.toUpperCase());
	}
}
