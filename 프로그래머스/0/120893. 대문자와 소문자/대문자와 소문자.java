class Solution {
    public String solution(String my_string) {
        String answer = "";
        int tmp = 0;
        for(int i = 0; i < my_string.length(); i++){
            tmp = (int) my_string.charAt(i);
            if(65 <= tmp && tmp <= 90){
                answer += (char) (tmp + 32);
            } else if(97 <= tmp && tmp <= 122){
                answer += (char) (tmp -32);
            }
        }
        return answer;
    }
}