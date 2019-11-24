package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String arg[]){
        System.out.println("Enter the number of hours employee worked");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.println("Hourly rate of the employee");
        double rate = scanner.nextDouble();
        scanner.close();

        double grosspay = rate * hours;

        System.out.println(grosspay);

        }
}
