class Solution {
    public static boolean searchPattern(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();
        if (m > n) {
            return false;
        }
        for (int i = 0; i <= n - m; i++) { 
            int j;
            for (j = 0; j < m; j++) {
                if (pat.charAt(j) != txt.charAt(i + j)) {
                    break;
                }
            }
            if (j == m) {
                return true; 
            }
        }
        return false;
    }
}
