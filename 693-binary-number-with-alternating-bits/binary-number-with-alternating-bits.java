class Solution {
    public boolean hasAlternatingBits(int n) {
        int highbit =Integer.highestOneBit(n);
        int allone = (highbit << 1) -1 ;

        if((n^(n >> 1)) == allone) return true;
        else return false;
    }
}