class Solution {
    public int solution(int order) {
        int answer = 0;
        String s = "" + order;
        String[] array = s.split("");
        for(int i = 0; i < array.length; i++){
            if(array[i].equals("3") || array[i].equals("6") ||
               array[i].equals("9")) answer += 1;
        }
        return answer;
    }
}