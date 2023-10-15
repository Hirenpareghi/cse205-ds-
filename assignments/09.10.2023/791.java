class Solution {
    public String customSortString(String order, String s) { 
        
        // step 1 - store common characters of both strings in string "l"
        String l = "";
        for (int i=0; i<order.length(); i++){
            char ele = order.charAt(i);
            if (s.contains(""+ele)){
                l = l + ele;
            }
        } 

        // step 2 - map frequencies of string "s"
        HashMap<Character,Integer> h = new HashMap<>();
        for (int i=0; i<s.length(); i++){
            char ele = s.charAt(i);
            if (h.containsKey(ele)){
                h.put(ele,h.get(ele)+1);
            }
            else{
                h.put(ele,1);
            }
        }

        //step 3 - in result string = (store common characters) X (their "step 2" frequencies)
        String res = "";
        for (int i=0; i<l.length(); i++){
            for (int j=1; j<=h.get(l.charAt(i)); j++){
                res = res + l.charAt(i);
            }
        }

        // step 4 - add all uncommon characters TO "res" string
        for (int i=0; i<s.length(); i++){
            char ele = s.charAt(i);
            if (l.contains(""+ele) == false){
                res = res + ele;
            }
        } 

        return res;
    }
}