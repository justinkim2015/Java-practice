import java.util.Scanner;

class Calculator {
  private static int add(int x, int y) {
    return x + y;
  }
  
  private static int minus(int x, int y) {
    return x - y;
  }

  private static int divide(int x, int y) {
    return x / y;
  }

  private static int multiply(int x, int y) {
    return x * y;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Let's do math!");

    System.out.println("Write the first number");
    int x = sc.nextInt();

    System.out.println("Write the second number");
    int y = sc.nextInt();

    System.out.println("Write the operator!");
    String operator = sc.next();

    switch(operator) {
      case "x":
        System.out.println("Your answer is " + multiply(x, y));
        break;
      case "/":
        System.out.println("Your answer is " + divide(x, y));
        break;
      case "+":
        System.out.println("Your answer is " + add(x, y));
        break;
      case "-":
        System.out.println("Your answer is " + minus(x, y));
        break;
      default:
        System.out.println("ILLEGAL OPERATOR");
    }

    sc.close();
  }
}

