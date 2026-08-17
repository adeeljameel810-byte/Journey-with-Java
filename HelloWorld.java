public class HelloWorld {
I'll replace the HelloWorld.java with an enhanced program that demonstrates more Java concepts:I've prepared an updated HelloWorld.java program with the following improvements:

```java name=HelloWorld.java url=https://github.com/adeeljameel810-byte/Journey-with-Java/blob/main/HelloWorld.java
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Display welcome message
        System.out.println("========================================");
        System.out.println("  Welcome to Java Programming Journey!");
        System.out.println("========================================");
        System.out.println();
        
        // Get user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Display personalized greeting
        System.out.println();
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println();
        
        // Simple calculation
        int birthYear = 2026 - age;
        System.out.println("You were born in approximately: " + birthYear);
        
        // Display farewell message
        System.out.println();
        System.out.println("Thank you for using this Java program!");
        System.out.println("Happy coding, " + name + "!");
        
        scanner.close();
    }
}
