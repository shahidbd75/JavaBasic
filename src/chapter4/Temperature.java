package chapter4;

public class Temperature{
    private double tempCelcius;
    private double tempFarenheit;
    public Temperature(){
        tempCelcius =0.0;
        tempFarenheit =0.0;
    }
    public void setFahrenheit(double tempInCelsius){

        tempFarenheit = ((double) 9/5 * tempInCelsius +32);
    }
    public void setCelsius(double tempInFahrenheit){
        tempCelcius = ((double)5/9) * (tempInFahrenheit - 32);
    }

    public double toCelsius() {
        return tempCelcius;
    }

    public double toFahrenheit() {
        return tempFarenheit;
    }
}
