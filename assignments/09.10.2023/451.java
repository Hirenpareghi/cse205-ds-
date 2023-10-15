class Solution {
    public String frequencySort(String s) {
        int[][] counts = new int[80][2];
        for (int i = 0; i < 80; i++) {
            counts[i][1] = i;
        }

        for (char ch : s.toCharArray()) {
            counts[ch - '0'][0]++;
        }

        Comparator<int[]> comp = (a1, a2) -> a2[0] - a1[0];
        Arrays.sort(counts, comp);
        
        char[] sAsChar = new char[s.length()];
        int pos = 0;
        for (int i = 0; i < 80; i++) {
            if (counts[i][0] == 0) {
                break;
            }
            for (int j = 0; j < counts[i][0]; j++) {
                sAsChar[pos++] = (char) ('0' + counts[i][1]); 
            }
        }
        return new String(sAsChar);
    }
}
