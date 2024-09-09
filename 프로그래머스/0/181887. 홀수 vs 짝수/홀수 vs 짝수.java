class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        //홀수 odd, 짝수 even        
        int oddSum = 0;
        int evenSum = 0;
        
        for(int i = 0; i < array.length; i++){
            if(i % 2 == 0){
                evenSum += array[i];
            }else{
                oddSum += array[i];
            }
        }
        
        if(evenSum > oddSum) return evenSum;
        return oddSum;
    }
}