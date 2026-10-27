package QuadraticEquation;
import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a:");
        double a = sc.nextDouble();

        System.out.println("Enter value of b:");
        double b = sc.nextDouble();

        System.out.println("Enter value of c:");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("This is not a quadratic equation.");
            return;
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and different:");
            System.out.println("Root1 = " + root1);
            System.out.println("Root2 = " + root2);

        }
        else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal:");
            System.out.println("Root = " + root);

        }
        else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);

            System.out.println("Roots are imaginary:");
            System.out.println("Root1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root2 = " + realPart + " - " + imaginaryPart + "i");
        }

            //sc.close();

    }
}

