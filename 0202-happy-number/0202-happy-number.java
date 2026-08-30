class Solution {
    public boolean isHappy(int n) {
        ArrayList l = new ArrayList<>();

        while (n > 0) {
            if (n == 1) {
                return true;
            } else if (l.contains(n)) {
                return false;
            }
            l.add(n);
            n = Happy(n);
        }
        return false;
    }

    private int Happy(int n) {
        int mul = 0;
        while (n > 0) {
            int m = n % 10;
            mul = mul + m * m;
            n = n / 10;

        }
        return mul;
    }
}