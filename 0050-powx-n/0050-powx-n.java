class Solution {
    public double myPow(double x, int n) {

        if (n == 0) {
            return 1;
        }

        long power = n;

        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        double half = myPow(x, (int)(power / 2));

        if (power % 2 == 0) {
            return half * half;
        }

        return x * half * half;
    }
}