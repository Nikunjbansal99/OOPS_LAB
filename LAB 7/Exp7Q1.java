class StudentDetails 
{
	private final String Name;
	private final int RollNo;
    
	public StudentDetails(int RollNo, String Name) 
	{
		this.RollNo = RollNo;
		this.Name = Name;
	}
    
    	@Override
    	public String toString() 
	{
        		return "Roll no:- " + RollNo + "  Student Name:- " + Name;
   	}
}

public class Exp7Q1 {
	public static void main(String[] args) 
	{
		StudentDetails[] stu = { new StudentDetails(63, "Nikunj"), new StudentDetails(65, "Om"), new StudentDetails(61, "Naman"), new StudentDetails(60, "Shrey"), new StudentDetails(59, "Mansi"), new StudentDetails(64, "Neha"), new StudentDetails(85, "Sai"), new StudentDetails(88, "Subham"), new StudentDetails(90, "yash") };
	try
	{
            		System.out.println("Student Details at index " + args[0] + ":\n" + stu[Integer.parseInt(args[0])]);
        	}
       	catch (ArrayIndexOutOfBoundsException e) 
	{
            		System.out.println("Array Index Out Of Bound. Invalid Argument. Error message:\n" + e);
        	}
	}
}
