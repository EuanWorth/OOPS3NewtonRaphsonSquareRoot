public class Main {
    public static double sqrt(double x) {
        final double precision = Math.pow(10, -15);
        if (x < 0) {
            throw new IllegalArgumentException();
        } else {
            if (x == 0) return 0;
            double previous = Double.MIN_VALUE;
            double current = x;
            while (Math.abs(current - previous) > precision) {
                previous = current;
                current = newtonRaphsonSqrt(current, x);
            }
            return current;
        }
    }

    private static double newtonRaphsonSqrt(double x, double c) {
        if (c > 0) {
            return x - (x * x - c) / (2 * x);
        } else {
            throw new IllegalArgumentException();
        }
    }
    public static void main(String[] args) {
     try {
         sqrt(-1);
     } catch (Exception e) {
         System.out.println("Caught");
     }
        double x = sqrt(2);
        System.out.println(x);
        System.out.println(Math.pow(x, 2));
        double y = sqrt(12032.384394839231);
        System.out.println(y);
        System.out.println(y * y);
    }
}