//https://www.hackerrank.com/challenges/append-and-delete/problem




  /*
     * Complete the 'appendAndDelete' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     *  3. INTEGER k
     */

    public static String appendAndDelete(String s, String t, int k) {
    // Write your code here


        String result = "No";
        int sLength = s.length();
        int tlength = t.length();
        int len = sLength > tlength ? tlength : sLength;
        int matchCharCount = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == t.charAt(i)) {
                matchCharCount++;
            } else {
                break;
            }
        }
        int minOpRequired = sLength + tlength - 2 * matchCharCount;
        if (k == minOpRequired) {
            return result = "Yes";
        } else if (k > minOpRequired && (k - minOpRequired) % 2 == 0 || k >= (sLength + tlength)) {
            result = "Yes";
        }
        return result;
    }
