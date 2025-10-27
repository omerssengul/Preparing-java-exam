import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();
        System.out.print("Enter the fourth number: ");
        int num4 = input.nextInt();

        int sum = num1 + num2 + num3 + num4;
        System.out.println("The sum is " + sum);
        double  average = sum / 4;
        System.out.println("The average is " + average);
        int max = num1;
        if (num2 > max) max = num2;
        if (num3 > max) max = num3;
        if (num4 > max) max = num4;

        System.out.println("The maximum number is " + max);
    }
}