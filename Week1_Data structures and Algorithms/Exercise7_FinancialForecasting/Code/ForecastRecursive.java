public class ForecastRecursive{

    //Method to calculate future value recursively
    public static double futureValueRecursive(double presentValue, double rate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return (1 + rate) * futureValueRecursive(presentValue, rate, years - 1);
    }

    //Example problem
    public static void main(String[] args) {
        double presentValue = 1000.0;
        double growthRate = 0.10;
        int years = 5;

        double result = futureValueRecursive(presentValue, growthRate, years);
        System.out.printf("Recursive Future Value after %d years: ₹%.2f", years, result);
    }
}
