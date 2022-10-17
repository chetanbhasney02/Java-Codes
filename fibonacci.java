// Fibonacci series program
public class Fibonacci {
// main program
public static void main(String[] args) {
int count = 10, var1 = 0, var2 = 1;
System.out.print("First " + count + " terms: ");
// Fibonacci series formation loop
for (int i = 1; i <= count; ++i)
{
System.out.print(var1 + " + ");
int added_sum= var1 + var2;
var1 = var2;
var2 = added_sum;
}
}
}
