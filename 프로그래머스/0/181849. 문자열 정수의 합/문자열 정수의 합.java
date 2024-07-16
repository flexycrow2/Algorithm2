class Solution {
    public int solution(String num_str) {
        String[] numbers = num_str.split("");
        int answer = 0;
        for(int i = 0; i < numbers.length; i++){
            answer += Integer.parseInt(numbers[i]);
        }       
        return answer;
    }
}