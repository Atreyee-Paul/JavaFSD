public class ForecastIterative {
    
    //Method to calculate future value iteratively
    public static double futureValueIterative(double presentValue, double rate, int years) {
    for (int i = 0; i < years; i++) {
        presentValue *= (1 + rate);
    }
    return presentValue;
}

    //Example problem
    public static void main(String[] args) {
        double presentValue = 1000.0;
        double growthRate = 0.10;
        int years = 5;

        double result = futureValueIterative(presentValue, growthRate, years);
        System.out.printf("Iterative Future Value after %d years: ₹%.2f", years, result);
    }
}
