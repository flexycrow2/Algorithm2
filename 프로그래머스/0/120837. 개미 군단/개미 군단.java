class Solution {
    public int solution(int hp) {
        int answer = 0;
        int[] ant = {5,3,1};
        int balance = hp;
        
        for(int i = 0; i < ant.length; i++){
            answer += balance / ant[i];
            balance %= ant[i];
        }
        return answer;
    }
}