import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number which you want to calculate the factorial of the number: ");
        int number = input.nextInt();
        if (number == 0 || number == 1) {
            System.out.println("The factorial of the number" + number + " is 1");
        }
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of the number" + number + " is " + factorial);



    }
}