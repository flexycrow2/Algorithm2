class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String myString1 = myString.toUpperCase();
        String pat1 = pat.toUpperCase();
        if(myString1.contains(pat1)) answer = 1;
        return answer;
    }
}