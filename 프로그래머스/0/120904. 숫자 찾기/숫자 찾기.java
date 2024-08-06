class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        String[] array = sb.toString().split("");
        for(int i = 0; i < array.length; i++){
            if(Integer.parseInt(array[i]) == k){
                answer = i + 1;
                break;
            }
        }
        return answer;
    }
}