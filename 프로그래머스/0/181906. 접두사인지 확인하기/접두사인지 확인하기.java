class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String new_string = "";
        if(my_string.length() >= is_prefix.length()) new_string = my_string.substring(0, is_prefix.length());
        if(new_string.equals(is_prefix)) answer = 1;
        return answer;
    }
}