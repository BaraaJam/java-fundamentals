package se.lexicon;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double temperatureCelsius = input.nextDouble();

        double temperatureFahrenheit = temperatureCelsius * 9.0 / 5 + 32;
        double temperatureKelvin = temperatureCelsius + 273.15;

        System.out.println("Celsius: " + temperatureCelsius + " °C");
        System.out.println("Fahrenheit: " + temperatureFahrenheit + " °F");
        System.out.println("Kelvin: " + temperatureKelvin + " K");

        input.close();
    }
}
