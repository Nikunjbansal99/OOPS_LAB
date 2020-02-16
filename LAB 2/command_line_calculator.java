class command_line_calculator{

public static void main(String args[]) {
double a = 0, b = 0, r = 0;
String operator;
System.out.println("Instructions for performing Arithmetic operations:");
System.out.println("For Addition use '+' Symbol");
System.out.println("For Addition use '-' Symbol");
System.out.println("For Addition use 'x' Symbol");
System.out.println("For Addition use '/' Symbol");
a = Integer.parseInt(args[0]);
operator = args[1];
b = Integer.parseInt(args[2]);

switch (operator) {
  case "+":
 	 r = a + b;
  	break;

  case "-":
  	r = a - b;
   	break;

  case "x":
  	r = a * b;
   	break;

  case "/":
  	r = a / b;
  	break;

  case "end":
  	System.out.println("Terminated.");
  	System.exit(0);
  	break;

  default: 
  	break;
    }
System.out.println("Result: " + r);
System.out.println("");

}
}