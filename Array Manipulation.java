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



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

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
    
       TreeMap<Integer,Integer>map=new TreeMap();
        long max=0;
        for(int i=0;i<queries.size();i++){
            
            
           
                int j=queries.get(i).get(0);
                if(map.containsKey(j)){
                   int val= map.get(j);
                   map.put(j,val+queries.get(i).get(2));
                }
                else{
                    map.put(j,queries.get(i).get(2));
                }
                
                int k=queries.get(i).get(1);
                if(map.containsKey(k)){
                   int val= map.get(k);
                   map.put(k,val-queries.get(i).get(2));
                }
                else{
                   map.put(k,-queries.get(i).get(2)) ;
                }
                
        
           
           
        }
        long res=0;
        for(Integer num:map.keySet()){
            
            int val=map.get(num);
            
            max+=val;
            res=Math.max(max,res );
        }
        return res;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, m).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        long result = Result.arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

