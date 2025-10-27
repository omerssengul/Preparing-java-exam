import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number(Only two digits!!): ");
        int num = input.nextInt();
        System.out.print("Enter the first digit of the number: ");
        int fd1 = input.nextInt();
        System.out.print("Enter the second digit of the number: ");
        int fd2 = input.nextInt();

        int sumOfDigits = fd1 + fd2;
        System.out.println("The sum of the digits is: " + sumOfDigits);
        if (sumOfDigits > 18) {
            System.out.println("Please enter only two digit number!!");
        }
        }
    }
