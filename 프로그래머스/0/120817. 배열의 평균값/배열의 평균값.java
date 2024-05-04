class Solution {
    public double solution(int[] numbers) {
        int notAnswer = 0;        
        for(int i = 0; i < numbers.length; i++){
            notAnswer += numbers[i];
        }
        double answer = (double) notAnswer / numbers.length;
        return answer;
    }
}