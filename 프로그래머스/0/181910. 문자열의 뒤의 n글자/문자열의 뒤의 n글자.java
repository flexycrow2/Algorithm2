class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int result = my_string.length() - n;
        answer = my_string.substring(result);
        return answer;
    }
}