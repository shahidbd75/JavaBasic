package chapter4;

public class WeightConverter {
    private double _gravity;
    public WeightConverter(double gravity){
        _gravity = gravity;
    }

    public double convert(double weight) {
        return _gravity * weight;
    }
}
