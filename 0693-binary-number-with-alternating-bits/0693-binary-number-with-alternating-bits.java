class Solution {
    public boolean hasAlternatingBits(int n) {
        int bm=1;
        int previous=n&1;
        while(n!=0){
            n>>=1;
            int current =n&1;
            if(current==previous){
                return false;
            }
            previous=current;
        }
        return true;
    }
}