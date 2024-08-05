class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(b);
        int first = Integer.parseInt(sb.toString());
        
        StringBuilder sbb = new StringBuilder();
        sbb.append(b);
        sbb.append(a);
        int second = Integer.parseInt(sbb.toString());
        
        if(first > second) answer = first;
        else answer = second;
        return answer;
    }
}