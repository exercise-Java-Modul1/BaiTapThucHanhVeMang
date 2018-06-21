import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int choice;
        double fahrenheit, celsius;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            System.out.println("your choice is: " + choice);
            switch (choice) {
                case 1:
                    System.out.println("1. Fahrenheit to Celsius");
                    System.out.print("input fahrenheit: ");
                    fahrenheit = sc.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                break;
                case 2:
                    System.out.println("2. Celsius to Fahrenheit");
                    System.out.print("input celsius: ");
                    celsius = sc.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.out.println("0. Exit.");
                    System.exit(0);
                    default:
                        System.out.println("Bạn nhập sai. Thoát chương trình.");
                        System.exit(0);
            }
            System.out.println();
            System.out.println("----------------------------------------------------");
            System.out.println();
        }while (choice != 0);

    }
    static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    static  double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
