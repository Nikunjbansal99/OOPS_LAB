class Exp8bQ2
{
	public static void main(String args[])
	{
		String str = args[0];
		System.out.println("Input String: " + str);
		
		Float StringToFloat = Float.parseFloat(str); //converts String to Float
		System.out.println("After String to Float conversion: " + StringToFloat);
		
		Float Floatvar = StringToFloat;
		float FloatTofloat = Floatvar.floatValue(); //converts Float to float
		System.out.println("After Float to float conversion: " + FloatTofloat);
		
		String FloatToString = Float.toString(Floatvar); //converts Float to String 
		System.out.println("After Float to String conversion: " + FloatToString);
																				
		float floatvar = FloatTofloat;
		Float floatToFloat = Float.valueOf(floatvar); //converts float to Float 
		System.out.println("After float to Float conversion: " + floatToFloat);

		float StringTofloat = Float.parseFloat(str); //converts String to float
		System.out.println("After String to float conversion: " + StringTofloat);

		String floatToString = String.valueOf(floatvar); //converts float to String
		System.out.println("After float to String conversion: " + floatToString);
	} 
}
