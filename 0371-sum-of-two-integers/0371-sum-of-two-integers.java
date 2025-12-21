class Solution {
    public int getSum(int a, int b) {

    while (b != 0) {
            // 1. Find the carry bits (where both bits are 1)
            int carry = a & b;

            // 2. Sum the bits without the carry using XOR
            a = a ^ b;

            // 3. Shift the carry to the left so it can be added to the next bit
            b = carry << 1;
        }
        return a;
    }
}