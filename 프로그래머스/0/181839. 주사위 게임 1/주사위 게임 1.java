class Solution {
    public int solution(int a, int b) {
        return method(a,b);
    }
    
    int method(int a, int b){
        if(a % 2 != 0 && b % 2 != 0){
            return a * a + b * b;
        }else if(a % 2 != 0 || b % 2 != 0){
            return 2 * (a + b);
        }else{
            if(a - b < 0){
                return (a - b) * -1;
            }else{
                return a - b;
            }
        }
    }
}