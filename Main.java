import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
        System.out.print("Input the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Input the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Input the third number: ");
        int num3 = sc.nextInt();

        int smallest = findSmallest(num1, num2, num3);
        System.out.println("The smallest value is " + smallest);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        checkNumber(number);
        */
        System.out.print("Input a password: ");
        String password = sc.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Password is valid: " + password);
        } else {
            System.out.println("Password is invalid.");
        }
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 10) {
            return false;
        }

        int dCount = 0;
        for (char ch : password.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
            if (Character.isDigit(ch)) {
                dCount++;
            }
        }

        return dCount >= 2;
    }

  public static void checkNumber(int num) {
            if (num > 0) {
                System.out.println("The number is positive.");
            } else if (num < 0) {
                System.out.println("The number is negative.");
            } else {
                System.out.println("The number is zero.");
            }
    }

    public static int findSmallest(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        return min;
    }


}