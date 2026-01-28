import java.util.Objects;
import java.util.Scanner;
import java.lang.String;

public class exercise_14 {
    public static void main(String[] args) {
        boolean repeat = false;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter the temperature in Celsius(°C): ");
            double temperatureInCelsius = sc.nextDouble();
            double temperatureInFahrenheit = convertToFahrenheit(temperatureInCelsius);
            System.out.printf("The temperature in Fahrenheit(°F) is: %.2f\n", temperatureInFahrenheit);

            System.out.print("Repeat(y/n): ");
            String yesOrNo = sc.next();
            repeat = Objects.equals(yesOrNo, "y") || Objects.equals(yesOrNo, "Y");
        } while (repeat);

        sc.close();
    }

    public static double convertToFahrenheit(double temperatureInCelsius) {
        return (temperatureInCelsius * 1.8) + 32;
    }
}
