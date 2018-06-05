package chapter4;

public class Temperature{
    private double tempCelcius;
    private double tempFarenheit;
    public Temperature(){
        tempCelcius =0.0;
        tempFarenheit =0.0;
    }
    public void setFahrenheit(double temperature){
        tempFarenheit = ((double) 9/5) * (temperature +32);
    }
    public void setCelsius(double temperature){
        tempCelcius = ((double)5/9) * (temperature - 32);
    }

    public double toCelsius() {
        return tempCelcius;
    }

    public double toFahrenheit() {
        return tempFarenheit;
    }
}
