import java.util.Scanner;

public class calculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Calculator");
    System.out.println("Choose Operation :");

    System.out.println("1.Add  2:Subtract  3:Multiply  4.Divide");
    int choice = input.nextInt();

    System.out.println("Enter first number: ");
    int a = input.nextInt();

    System.out.println("Enter second number: ");
    int b = input.nextInt();

    switch(choice){
      case 1 :  System.out.println(a + " + " + b + " = " + (a+b));
                break;
      case 2 :  System.out.println(a + " - " + b + " = " + (a-b));
                break;
      case 3 :  System.out.println(a + " * " + b + " = " + (a*b));
                break;
      case 4 :  System.out.println(a + " / " + b + " = " + (a/b));
                break;
      default : System.out.println("Incorrect Choice");
                break;
    }

  }
}
