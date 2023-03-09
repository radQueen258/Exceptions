import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class exceptionExercises {
    static Random any = new Random();

    public static void main(String[] args) {
        Scanner radka = new Scanner(System.in);

        try {
            System.out.println("x= ");
            double x = radka.nextDouble();
            System.out.println("x = " + x + " and y = " + function(x));
        }
        catch (InputMismatchException ime) {
            System.out.println("It is not a number");
        }
        catch (IllegalArgumentException iae) {
            System.out.println("There is a 0 in the denominator");
        }
        catch (Exception e) {
            System.out.println("Unknown error");
        }
        finally {
            System.out.println("End Program :) ");
        }
    }

    public static double function (double x) {
        double a = any.nextDouble(-50,50);
        System.out.println("Knowing that 'a' is: " + a);

        if (x < 0) {
            if (x == 0) throw new IllegalArgumentException("There is a zero in the denominator");
            return x + Math.pow(Math.sin((1 /(x - a)) + 4), 2);
        } else {
            if (x >= a) throw new IllegalArgumentException("Impossible to find the square root " +
                                                     "of a negative number or denominator is equal to 0");
            return (a * x) / Math.sqrt((a * a - x * x));
        }
    }
}
