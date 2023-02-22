import java.util.Scanner;

class Calculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Let's do math!");

    System.out.println("Write the first number");
    int x = sc.nextInt();

    System.out.println("Write the second number");
    int y = sc.nextInt();

    System.out.println("Write the operator!");
    String operator = sc.next();

    int answer; 
    switch(operator) {
      case "x":
        answer = x * y;
        System.out.println("Your answer is " + answer);
        break;
      case "/":
        answer = x / y;
        System.out.println("Your answer is " + answer);
        break;
      case "+":
        answer = x + y;
        System.out.println("Your answer is " + answer);
        break;
      case "-":
        answer = x - y;
        System.out.println("Your answer is " + answer);
        break;
      default:
        System.out.println("ILLEGAL OPERATOR");
    }

    sc.close();
  }
}

