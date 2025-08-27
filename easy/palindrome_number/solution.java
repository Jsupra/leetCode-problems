class Solution {
    public boolean isPalindrome(int x) {
       int c = x;
       int reverse = 0;
       while (x >0){
        int y = x %10;
        reverse = reverse * 10 + y;
        x  = x/10;
       }
        return c  == reverse;
        
    }
}