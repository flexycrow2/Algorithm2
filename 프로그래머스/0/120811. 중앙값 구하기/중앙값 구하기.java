import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        int count = array.length / 2;
        answer = array[count];
        return answer;
    }
}