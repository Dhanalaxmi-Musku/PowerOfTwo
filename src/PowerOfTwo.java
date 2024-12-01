public class PowerOfTwo {
    public static void main(String[] args) {
            int N = Integer.parseInt(args[0]);
            if (N < 0 || N >= 31) {
                System.out.println("Invalid input! N must be in the range 0 <= N < 31.");
                return;
            }
            System.out.println("Powers of 2 up to 2^" + N + ":");
            for (int i = 0; i <= N; i++) {
                System.out.println("2^" + i + " = " + (int) Math.pow(2, i));
            }
    }
}
