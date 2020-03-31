class InputName
{
	String Name;
	InputName(String s)
	{ 
		Name=s;
	} 
	void show()
	{
		System.out.println("Entered Name :" + Name);
 
		int N=0;
		int len=Name.length(); 
		for(int i=0;i<len;i++)
			if(Name.charAt(i)=='A'||Name.charAt(i)=='a')
			{ 
				N++;
				System.out.println("Present at Position :"+(i+1));
			}
			System.out.println("Number of times 'a' or 'A' occured is :"+N); 
			if(N==0)
				System.out.println("There is no 'A' or 'a' available in the string");
	}
}
class Exp8aQ4
{
	public static void main(String ar[])
	{
		InputName s1=new InputName("Nikunj Bansal"); 
		s1.show();
		InputName s2=new InputName("ML Developer"); 
		s2.show();
	}
}
