class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int o=x;   //original
        int r=0;   //Reversed
        while(x>0){
            int d=x%10;   //Digit
            r=r*10+d;
            x=x/10;
        }
        return o==r;
    }
}
