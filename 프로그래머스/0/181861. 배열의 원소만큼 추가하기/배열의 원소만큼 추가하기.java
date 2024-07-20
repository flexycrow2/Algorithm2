class Solution {
    public int[] solution(int[] arr) {
        // return 배열 길이 구하기
        int length = 0;
        for(int i = 0; i < arr.length; i++){
            length += arr[i];
        }
        int[] answer = new int[length];
        
        // 배열에 넣기
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i]; j++){
                answer[count] = arr[i];
                count++;
            }
        }
        return answer;
    }
}