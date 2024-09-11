class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            answer[i] = arr[i];
        }
        boolean odd = false;
        oddEven(answer, n, odd);
        return answer;
    }
    
    void oddEven(int[] answer, int n, boolean odd){
        if(answer.length % 2 != 0){
            odd = true;
            plusMethod(answer, n, odd);
        }else{
            plusMethod(answer, n, odd);
        }
    }
    
    void plusMethod(int[] answer, int n, boolean odd){
        if(odd){
            for(int i = 0; i < answer.length; i += 2){
                answer[i] += n; 
            }
        }else{
            for(int i = 1; i < answer.length; i += 2){
                answer[i] += n;
            }
        }
    }
}