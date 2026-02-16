class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = func(slow);               // move 1 step
            fast = func(func(fast));         // move 2 steps
        } while (slow != fast);

        return slow == 1;
    }

    private int func(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }
}
