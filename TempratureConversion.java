package Task1;

import java.util.Scanner;

public class TempratureConversion {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the original unit of measurement (Celsius, Fahrenheit, or Kelvin): ");
        String unit = scanner.nextLine().toLowerCase();
        

        switch (unit) {
            case "celsius":
                double fahrenheit = celsiusToFahrenheit(temperature);
                double kelvin = celsiusToKelvin(temperature);
                System.out.printf("%.2f°C is equal to %.2f°F and %.2fK", temperature, fahrenheit,kelvin);
                break;
            case "fahrenheit":
                double celsius = fahrenheitToCelsius(temperature);
                kelvin = fahrenheitToKelvin(temperature);
                System.out.printf("%.2f°F is equal to %.2f°C and %.2fK", temperature, celsius, kelvin);
                break;
            case "kelvin":
                celsius = kelvinToCelsius(temperature);
                fahrenheit = kelvinToFahrenheit(temperature);
                System.out.printf("%.2fK is equal to %.2f°C and %.2f°F", temperature, celsius, fahrenheit);
                break;
            default:
                System.out.println("Please enter a valid unit: Celsius, Fahrenheit, or Kelvin");
        }

        scanner.close();
    }
}
