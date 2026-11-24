
class Solution {

    int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    public int maxLength(int[] nums) {

        int max = 0;

        for (int i = 0; i < nums.length; i++) {

            long prod = 1;
            int g = 0;
            long l = 1;

            for (int j = i; j < nums.length; j++) {

                prod *= nums[j];
                g = gcd(g, nums[j]);
                l = (l / gcd((int)l, nums[j])) * nums[j];

                if (prod == g * l) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }

        return max;
    }
}
