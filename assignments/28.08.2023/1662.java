class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "Hi";
        String s2 = "Hi";
        for(int i=0;i<word1.length;i++){
            s1+= word1[i];
        }
        String ans1 = s1;
        for(int i=0;i<word2.length;i++){
            s2+= word2[i];
        }
        String ans2 = s2;

        if (s1.equals(s2)){
            return true;
        }
        else{
            return false;
        }
        
    }
}