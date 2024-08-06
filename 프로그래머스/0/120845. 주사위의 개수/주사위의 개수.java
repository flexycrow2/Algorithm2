class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        int boxSize = 1;
        for(int i = 0; i < box.length; i++){
            answer *= box[i];
            boxSize *= n;
        }
        answer /= boxSize;
        return answer;
    }
}