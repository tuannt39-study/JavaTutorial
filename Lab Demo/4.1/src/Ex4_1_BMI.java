
import java.util.Scanner;

public class Ex4_1_BMI {

    public static void main(String[] args) {

        System.out.println("Computing Body Mass Index");
        System.out.println("Please enter your weight and height");
        double weight, height, BMI;
        //constants
        final double pound_to_kilogram = 0.45359237;
        final double inch_to_meters = 0.0254;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your weight:");
        weight = scanner.nextDouble();
        System.out.print("Your height:");
        height = scanner.nextDouble();

        BMI = pound_to_kilogram * weight / Math.pow(inch_to_meters * height, 2);
        //Tính theo kilogam và centimet: BMI = weight / Math.pow(height/100, 2);
        System.out.printf("%-20s%s", "BMI", "Interpretation\n");

        /*if (BMI < 18)
            System.out.printf("%-20.2f%s", BMI, "Underweight");
        if (18.5 <= BMI && BMI < 25.0)
            System.out.printf("%-20.2f%s", BMI, "Normal");
        if (25.0 <= BMI && BMI < 30.0)
            System.out.printf("%-20.2f%s", BMI, "Overweight");
        if (BMI >= 30.0)
            System.out.printf("%-20.2f%s", BMI, "Obese");*/

        if (BMI < 18)
            System.out.printf("%-20.2f%s", BMI, "Underweight");
        else if (BMI < 25.0)
            System.out.printf("%-20.2f%s", BMI, "Normal");
        else if (BMI < 30.0)
            System.out.printf("%-20.2f%s", BMI, "Overweight");
        else
            System.out.printf("%-20.2f%s", BMI, "Obese");
    }

    /* case:
     * 127,65 Normal
     * 100,65 Underweight
     * 180,65 Overweight
     * 200,65 Obese
     */
}
