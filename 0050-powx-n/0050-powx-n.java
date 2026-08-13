class Solution {
    public double myPow(double x, int n) {

        long power = n;  // long handles Integer.MIN_VALUE

        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        return power(x, power);
    }

    public double power(double x, long n) {

        // Base case
        if (n == 0) {
            return 1;
        }

        // Recursive call
        double half = power(x, n / 2);

        // Even power
        if (n % 2 == 0) {
            return half * half;
        }

        // Odd power
        return x * half * half;
    }
}