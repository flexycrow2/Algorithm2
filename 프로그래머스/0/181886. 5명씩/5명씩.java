class Solution {
    public String[] solution(String[] names) {
        int isFive = 1;
        if(names.length % 5 == 0) isFive = 0;
        //와니 안녕
        
        String[] answer = new String[names.length / 5 + isFive];
        int index = 0;
        for(int i = 0; i < answer.length; i++){
            answer[i] = names[index];
            index += 5;
        }
        return answer;
    }
}