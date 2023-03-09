import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class exceptionExercises {
    static Random any = new Random();
    public static void main(String[] args) {
        Scanner radka = new Scanner(System.in);

        //--------------EXERCISE 1--------------
//        System.out.println("--------------EXERCISE 1--------------");
//        try {
//            System.out.println("x= ");
//            double x = radka.nextDouble();
//            System.out.println("x = " + x + " and y = " + function(x));
//        }
//        catch (InputMismatchException ime) {
//            System.out.println("It is not a number");
//        }
//        catch (IllegalArgumentException iae) {
//            System.out.println("There is a 0 in the denominator");
//        }
//        catch (Exception e) {
//            System.out.println("Unknown error");
//        }
//        finally {
//            System.out.println("End Program :) ");
//        }
        System.out.println();
        //--------------EXERCISE 2--------------
        System.out.println("--------------EXERCISE 2--------------");
        try {
            int[] Arr = new int[8];
            fillingArray(Arr);
            Arr[4] = 3;
            Arr[5] = 2;
            Arr[6] = 64;
            Arr[7] = 12;

            for (int j : Arr) {
                System.out.print(j + " ");
            }
            System.out.println();

            int[] arrRnd = new int[10];
            fillingRandom(arrRnd);
            System.out.println(Arrays.toString(arrRnd));
            System.out.println();
        }
        catch (IllegalArgumentException iae) {
            System.out.println("Only integers are allowed in this code!");
        }
        catch (ArrayIndexOutOfBoundsException aibe) {
            System.out.println("There is an issue with the length of the array");
        }
        catch (Exception e) {
            System.out.println("Unknown error");
        }
        finally {
            System.out.println("End Program 2 ;)");
        }
        //--------------EXERCISE 3--------------
        System.out.println("--------------EXERCISE 3--------------");

        System.out.println();
        //--------------EXERCISE 4--------------
        System.out.println("--------------EXERCISE 4--------------");
    }
        //--------------EXERCISE 1--------------
//    public static double function (double x) {
//        double a = any.nextDouble(-50,50);
//        System.out.println("Knowing that 'a' is: " + a);
//
//        if (x < 0) {
//            if (x == 0) throw new IllegalArgumentException("There is a zero in the denominator");
//            return x + Math.pow(Math.sin((1 /(x - a)) + 4), 2);
//        } else {
//            if (x >= a) throw new IllegalArgumentException("Impossible to find the square root " +
//                                                     "of a negative number or denominator is equal to 0");
//            return (a * x) / Math.sqrt((a * a - x * x));
//        }
//    }

    //--------------EXERCISE 2--------------
    public static void fillingArray (int[]array) {
        Scanner radka = new Scanner(System.in);
        System.out.println("Insert the elements of the array up to half: ");
       for (int i = 0; i < array.length / 2; i ++) {
            array[i] = radka.nextInt();
        }
    }
    public static void fillingRandom (int[]array) {
        for (int i = 0; i < array.length; i ++) {
            array[i] = any.nextInt(-10,20);
        }
    }
    //--------------EXERCISE 3--------------
    //--------------EXERCISE 4--------------
}
