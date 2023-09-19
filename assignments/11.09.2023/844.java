class Solution {
    public boolean backspaceCompare(String s, String t) {
        return processBackspace(s).equals(processBackspace(t));
    }

    private String processBackspace(String s){
        StringBuilder sb = new StringBuilder(s);
        while(sb.indexOf("#")>=0){
            if(sb.indexOf("#") == 0)
                sb.deleteCharAt(0);
            else
                sb.delete(sb.indexOf("#")-1, sb.indexOf("#")+1);
        }
        return sb.toString();
    }
}