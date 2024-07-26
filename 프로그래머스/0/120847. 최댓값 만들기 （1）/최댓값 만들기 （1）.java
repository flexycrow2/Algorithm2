import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 1;
        Arrays.sort(numbers);
        for(int i = numbers.length - 2; i < numbers.length; i++){
            answer *= numbers[i];
        }
        return answer;
    }
}