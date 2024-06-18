class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int a = my_string.length();
        int b = is_suffix.length();
        String answer1 = "";
        if(a >= b){
            answer1 = my_string.substring(a-b, a);
        }else return answer;
        if(answer1.equals(is_suffix)) answer = 1;
        return answer;
    }
}