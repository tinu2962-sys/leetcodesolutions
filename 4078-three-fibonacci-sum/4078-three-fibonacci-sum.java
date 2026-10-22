class Solution {
    public boolean threeFibonacciSum(int n) {
        if(n%2!=0||n<2){
            return false;
        }
        int target=n/2;
        int a=1;
        int b=1;
        while(b<target){
            int next=a+b;
            a=b;
            b=next;
        }
        return b==target;
    }
}