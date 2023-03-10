import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class exceptionExercises {
    static Random any = new Random();
    static Scanner radka = new Scanner(System.in);
    public static void main(String[] args) {

        exercise1();
        exercise2();
        exercise3and4();

    }

    public static void exercise1() {

        System.out.println("--------------EXERCISE 1--------------");
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
            System.out.println("End Program 1 :) ");
        }
        System.out.println();

    }

    public static void exercise2(){
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
    }

    public static void exercise3and4() {
        System.out.println("--------------EXERCISE 3 AND 4--------------");


        try {
            System.out.println("n: ");
            int n = radka.nextInt();

            if (n < 15) {
                throw new UnauthorizedException();
            }

            int[] x = new int[n];
            System.out.println("k1: ");
            int k1 = radka.nextInt();
            System.out.println("k2: ");
            int k2 = radka.nextInt();

            if (k1 > n || k2 > n) {
                throw new InvalidNumbers();
            }
            if (k1 > k2) throw new InvalidNumbers();

            int[] y = new int[n];
            fillingRnd12(x, k1, k2,y);
            System.out.println("X Array");
            System.out.println(Arrays.toString(x));
            System.out.println("Y Array");
            System.out.println(Arrays.toString(y));
            System.out.println();

            System.out.println();
        }

        catch (IllegalArgumentException iae) {
            System.out.println("Only integers are allowed in this code!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There is an issue with the length of the array");
        }
        catch (Exception e) {
            System.out.println("Unknown error");
        }
        finally {
            System.out.println("End Program 3 and 4 ;)");
        }

    }
        //--------------EXERCISE 1--------------
    public static double function (double x) {
        double a = any.nextDouble(-50,50);
        System.out.println("Knowing that 'a' is: " + a);

        if (x < 0 ) {
            if (x == 0) throw new IllegalArgumentException("There is a zero in the denominator");
            return x + Math.pow(Math.sin((1 /(x - a)) + 4), 2);
        } else {
            if (x >= a) throw new IllegalArgumentException("Impossible to find the square root " +
                                                     "of a negative number or denominator is equal to 0");
            return (a * x) / Math.sqrt((a * a - x * x));
        }
    }

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

    public static boolean shadedArea (int array, int arr) {
        return array >= 0 && arr >= 0 && Math.sqrt(((array * array) + (arr * arr))) <= Math.sqrt(32) ||
                array <= 0 && arr <= 0 && array * arr <= 16 || array <= 0 && arr >= 0 && array * arr <= 16;

    }
    public static void fillingRnd12 (int[] array, int k1, int k2, int[] arr) {
        for (int i = 0; i < array.length; i ++) {
           array[i] = any.nextInt(5,15);
           arr [array[i]] = any.nextInt(5,15);

//            array[k1] = 20;
//            array[k2] = 25;

           if (shadedArea(array[i], arr[array[i]])) {
               System.out.println("x: " + array[i] + ", y: " + arr[array[i]]);
           } else {
               System.out.println("No point !");
           }
       }
        array[k1] = 20;
        array[k2] = 25;

    }
    //--------------EXERCISE 4--------------
}
    class UnauthorizedException extends RuntimeException {
        public UnauthorizedException () {
            super("Invalid Number, n should be bigger than 15");
        }
        public UnauthorizedException (String message) {
            super(message);
        }

}
    class InvalidNumbers extends Exception {
    public InvalidNumbers () {
        super(("k1 and k2 should be between 0 and the value of n"));
        }
        public InvalidNumbers (String message) {
        super(message);
        }
    }
