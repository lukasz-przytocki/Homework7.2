public class NumbersWhile {
    public static void main(String[] args) {
        double i = 0;

        while (i <= 3.0) {
            System.out.printf("%.1f ", i);
            i+=0.1;
            i= Math.round(i*10)/10.0d;
        }

        System.out.println("\nSecond loop");

        i = 0;
        do {
            System.out.printf("%.1f ", i);
            i += 0.1;
            i= Math.round(i*10)/10.0d;
        } while (i <= 3);
    }
}

