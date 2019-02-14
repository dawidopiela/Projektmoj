package zadanie8;

import java.util.Scanner;

import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sqrt;

public class Zadanie8 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


       int c = 4;

        System.out.println( "pole pola trojkata wynosi=" + 0.5 * c *(c*sqrt(3)/2));

        System.out.println(pow(c,3));

        int pierwsza= 2;
        int druga= 6;
        int trzecia= 7;
        int czwarta = 3;

        System.out.println((double)(pierwsza + druga + trzecia + czwarta)/4);

        int bok = 5;

        {
            System.out.println("podaj wartośc zmiennej a:");
            int a = scanner.nextInt();
            System.out.println("podaj wartośc zmiennej b:");
            int b = scanner.nextInt();
            scanner.close();
        }










    }
    }