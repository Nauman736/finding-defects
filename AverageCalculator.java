public class AverageCalculator {

    public static int calculateAverage(int a, int b, int c) {
        int sum;
        sum = a + b;      
        int avg = sum / 2; 
        return avg;
    }

    public static void main(String[] args) {
        System.out.println(calculateAverage(10, 20, 0));
    }
}
