//https://www.hackerrank.com/challenges/crush/problem


/*
     * Complete the 'arrayManipulation' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
    // Write your code here
    
        long[]arr=new long[n+1];
        long max=0;
        for(int i=0;i<queries.size();i++){
            for(int j=queries.get(i).get(0);j<=queries.get(i).get(1);j++){
                arr[j]+=queries.get(i).get(2);
                max=Math.max(max, arr[j]);
            }
        }
        return max;
    }



////////////////////////////////////
