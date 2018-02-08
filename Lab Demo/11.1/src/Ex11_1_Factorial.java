import java.util.Scanner;

public class Ex11_1_Factorial {

    public static void main(String[] args) {
        System.out.println("Factorial calculation program");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to calculate factorial:");
        int N = scanner.nextInt();

        int fact = factorial(N);
        System.out.println("The factorial of N is: " + fact);
    }

    static int factorial(int N) {
        if (N <= 1) { // recursive exit condition
            return 1;
        }
        return N * factorial(N - 1); //recursive call
    }
}
