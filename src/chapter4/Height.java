package chapter4;

public class Height {
    private double recommendedWeight;
    public double GetRecommendedWeight(int age,double height){
        recommendedWeight = (height - 100 + age / 10) * 0.90;
        return recommendedWeight;
    }
}
