public class static_
{
 // Static variable
    static int staticVariable = 10;
 // Static block
    static
    {
        System.out.println("Static block is executed.");
        staticVariable = 20;
    }
// Static method
 static void staticMethod()
 {
    System.out.println("Static method is called.");
    System.out.println("Static variable value: " + staticVariable);
 }
 public static void main(String[] args)
 {
    System.out.println("Main method is called.");
    System.out.println("Static variable value: " + staticVariable);
    // Calling the static method
    staticMethod();
 }
}
