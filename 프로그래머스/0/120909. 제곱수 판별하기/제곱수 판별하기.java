class Solution {
    public int solution(int n) {
        int answer = 2;
        int a = 1;
        while(a <= n){
            if(a * a == n){
                answer = 1;
                break;
            }
            a++;
        }
        return answer;
    }
}