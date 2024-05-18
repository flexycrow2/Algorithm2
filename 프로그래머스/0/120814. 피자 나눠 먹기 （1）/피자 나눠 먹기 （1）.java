class Solution {
    public int solution(int n) {
        int pizza = 7;
        int answer = 0;
        if(n % pizza == 0) answer = n / pizza;
        else answer = n / pizza + 1;
        return answer;
    }
}