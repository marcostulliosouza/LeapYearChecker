# Leap Year Checker

This is a simple Java program that checks if a given year is a leap year based on the rules of the Gregorian calendar.

## Instructions

A leap year occurs:

- In every year that is evenly divisible by 4.
- Unless the year is evenly divisible by 100, in which case it's only a leap year if the year is also evenly divisible by 400.

### Examples

- 1997 was not a leap year as it's not divisible by 4.
- 1900 was not a leap year as it's not divisible by 400.
- 2000 was a leap year!

## Usage

To use this program, run the `Main` class and input a year when prompted. The program will then determine whether the given year is a leap year or not.

```java
import java.util.Scanner;

public class Main {
    static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ano para verificar se é bissexto: ");
        int year = scanner.nextInt();
        System.out.println(isLeapYear(year) ? "Ano bissexto" : "Ano não bissexto");
    }
}
