import java.util.Scanner;
public class Main {
    static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ano para verificar se é bissexto: ");
        int year = scanner.nextInt();
        System.out.println(isLeapYear(year)? "Ano bissexto": "Ano não bissexto");
    }
}
