package chapter4;

public class TempConvertion {
    public static void main(String[] args) {
        Temperature temperature = new Temperature();

        temperature.setFahrenheit(100);
        System.out.println("Temperature in Farenheit: " + temperature.toFahrenheit());

        temperature.setCelsius(237.6);
        System.out.println("Temperature in Celcius: " + temperature.toCelsius());
    }
}

