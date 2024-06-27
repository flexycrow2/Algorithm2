class Solution {
    public int solution(String my_string, String is_suffix) {
        // int answer = 0;
        // int a = my_string.length();
        // int b = is_suffix.length();
        // String answer1 = "";
        // if(a >= b){
        //     answer1 = my_string.substring(a-b, a);
        // }else return answer;
        // if(answer1.equals(is_suffix)) answer = 1;
        // return answer;
        int answer = 0;
        if(my_string.length() < is_suffix.length()) return answer;

        StringBuilder sb = new StringBuilder(my_string);
        StringBuilder sb2 = new StringBuilder(is_suffix);
        sb.reverse();
        sb2.reverse();
        String substring = sb.substring(0,is_suffix.length());
        String substring2 = sb2.toString();
        
        if(substring.equals(substring2)) answer = 1;
        return answer;
    }
}