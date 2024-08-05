class Solution {
    public int[] solution(int[] num_list, int n) {
        int isMultiple = 0;
        if(num_list.length % n != 0) isMultiple = 1;
        int[] answer = new int[num_list.length / n + isMultiple];
        int index = 0;
        for(int i = 0; i < answer.length; i++){
            answer[i] = num_list[index];
            index += n;
        }
        return answer;
        //으아ㅏ아아아아아아아아아아아아아아아아ㅏㅏㅏㅏㅏㅏㅏㅏ아아아아앙ㅇ아ㅏㅏ
    }
}