import java.util.Scanner;

public class Ex11_1_giai_thua {

    public static void main(String[] args) {
        System.out.println("Factorial calculation program");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to calculate factorial:");
        int N = scanner.nextInt();

        int fact = factCalculation(N);
        System.out.println("The factorial of N is: " + fact);
    }

    static int factCalculation(int N) {
        if (N <= 1) {
            return 1;
        }
        return N * factCalculation(N - 1);
    }
}
