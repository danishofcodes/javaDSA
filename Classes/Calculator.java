import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num1=0.0, num2 =0.0;
        Scanner sc = new Scanner(System.in);
        
        // Mathfunctions mathfuncsObj = new Mathfunctions();
        System.out.println("Calculation Options : 1)add 2)subtract 3)multiply 4)divide");
        int opt = sc.nextInt();
        switch (opt) {
                case 1:
                System.out.println("Enter first number");
                num1 = sc.nextInt();
        
                System.out.println("Enter second number");
                num2 = sc.nextInt();
        
                System.out.println("Added Results : "+ Mathfunctions.add(num1, num2));
                break;
        
                case 2:
                System.out.println("Enter first number");
                num1 = sc.nextInt();
        
                System.out.println("Enter second number");
                num2 = sc.nextInt();
        
                System.out.println("Subraction Results : "+ Mathfunctions.sub(num1, num2));
                break;
        
                case 3:
                System.out.println("Enter first number");
                num1 = sc.nextInt();
        
                System.out.println("Enter second number");
                num2 = sc.nextInt();
        
                System.out.println("Multiplication Results : "+ Mathfunctions.mul(num1, num2));
                break;
        
                case 4:
                System.out.println("Enter the number to divide (numerator)");
                num1 = sc.nextInt();
        
                System.out.println("Enter the Denominator");
                num2 = sc.nextInt();
        
                System.out.println("Division Results : "+ Mathfunctions.div(num1, num2));
                System.out.println("Remainder: "+ Mathfunctions.remainder(num1, num2));
                break;
        
        
        
            default:
            System.out.println("invalid choice");
                break;
        }
        sc.close();
    }
}

class Mathfunctions {
    public static double add(double num1, double num2) {
        double total = num1 + num2;
        return total;
    }
    public static double sub(double num1, double num2) {
        double total = num1 - num2;
        return total;
    }
    public static double mul(double num1, double num2) {
        double total = num1 * num2;
        return total;
    }
    public static double div(double num1, double num2) {
        double res = num1 / num2;
        return res;
    }
    public static double remainder(double num1, double num2) {
        double rem = num1 % num2;
        return rem;
    }
}
