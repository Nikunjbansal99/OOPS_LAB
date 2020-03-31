class Exp8bQ1
{
	public static void main(String args[])
	{
		String str = args[0];
		System.out.println("Input String: " + str);
		
		Integer StringToInteger= Integer.parseInt(str); //converts String to Integer
		System.out.println("After String to Integer conversion: " + StringToInteger);
		
		Integer in1 = StringToInteger;
		int IntegerToInt = in1.intValue(); //converts Integer to int
		System.out.println("After Integer to int conversion: " + IntegerToInt);
																				
		int in2 = IntegerToInt;
		Integer IntToInteger = Integer.valueOf(in1); //converts int to Integer 
		System.out.println("After int to Integer conversion: " + IntToInteger);
	
		String IntegerToString = Integer.toString(in1); //converts Integer to String
		System.out.println("After Integer to String conversion: " + IntegerToString);

		int StringToInt = Integer.parseInt(str); //converts String to int
		System.out.println("After String to int conversion: " + StringToInt);

		String IntToString = String.valueOf(in2); //converts int to String
		System.out.println("After int to String conversion: " + IntToString);
	}
}
