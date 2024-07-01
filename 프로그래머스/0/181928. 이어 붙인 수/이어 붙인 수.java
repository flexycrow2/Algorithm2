class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        StringBuilder sc = new StringBuilder();
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
                sb.append(num_list[i]);
            } else {
                sc.append(num_list[i]);
            }
        }
        answer = Integer.parseInt(sb.toString()) + Integer.parseInt(sc.toString());        
        return answer;
    }
}