//https://www.hackerrank.com/challenges/two-strings/problem


 /*
     * Complete the 'twoStrings' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static String twoStrings(String s1, String s2) {
    // Write your code here
    int[]arr=new int[27];
    int n=s1.length();
    for(int i=0;i<n;i++){
        arr[s1.charAt(i)-'a']++;
    }
    
    int m=s2.length();
    for(int i=0;i<m;i++){
        if( arr[s2.charAt(i)-'a']!=0){
            return "YES";
        }
    }
    
    
    return "NO";

    }
