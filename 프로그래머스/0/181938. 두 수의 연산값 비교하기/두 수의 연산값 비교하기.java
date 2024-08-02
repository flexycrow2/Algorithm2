class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String string = "";
        string += a;
        string += b;
        answer = Integer.parseInt(string);
        if(2 * a * b > answer) return 2 * a * b;
        return answer;
    }
}