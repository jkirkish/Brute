package Recursion;

public class ExponentsPower {

    static final int MOD = 1000000007;

    static long calculatePower(long a, long b) {
        if (b == 0) {
            return 1;
        }

        long result = calculatePower(a, b / 2) % MOD;
        result = (result * result) % MOD;

        if (b % 2 == 1) {
            result = (result * a) % MOD;
        }

        return result;
    }

    static Integer calculate_power(Long a, Long b) {
        long result = calculatePower(a, b);
        return (int) (result % MOD);
    }

    public static void main(String[] args) {
        // Example usage
        long a = 2;
        long b = 10;
        Integer result = calculate_power(a, b);
        System.out.println(result); // Output: 1024
    }
}
