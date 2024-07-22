class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        putIn(answer, numbers, num1);
        return answer;
    }
    
    void putIn(int[] answer, int[] numbers, int num1){
        for(int i = 0; i < answer.length; i++){
            answer[i] = numbers[num1];
            num1++;
        }
    }
}