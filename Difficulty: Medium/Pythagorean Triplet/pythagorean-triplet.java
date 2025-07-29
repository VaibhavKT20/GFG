class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        int n = arr.length;

        int maxVal = 0;
        for (int val : arr) {
            if (val > maxVal) maxVal = val;
        }

        int[] freq = new int[maxVal + 1];
        for (int val : arr) {
            freq[val]++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = arr[i];
                int b = arr[j];
                int cSquare = a * a + b * b;
                int c = (int) Math.sqrt(cSquare);

                if (c * c == cSquare && c <= maxVal) {
                    if (freq[c] > 0) {
                        if ((c == a && freq[c] > 1) || (c == b && freq[c] > 1) 
                        || (c != a && c != b)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
