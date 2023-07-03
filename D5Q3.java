class Solution {
    public boolean isHappy(int n) {
        Set<Integer> result=new HashSet<>();
        if(n==1){
            return true;
        }
        while(n!=1 && !result.contains(n)){
            result.add(n);  
            n=getNextNumber(n);
        }
        return n==1;    

    }
    private int getNextNumber(int n) {
        int res = 0;
        while (n > 0) {
            int temp = n % 10;
            res += temp * temp;
            n = n / 10;
        }
        return res;
    }
}
