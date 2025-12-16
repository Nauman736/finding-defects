public class AvgCalculator {
    public static int calculateAverage(int a, int b, int c) {
        int sum;
        sum = a + b;      // ❌ c is ignored
        int avg = sum / 2; // ❌ wrong divisor
        return avg;
    }
    
    public static void main(String[] args) {
        System.out.println(calculateAverage(10, 20, 0));
    }
}
