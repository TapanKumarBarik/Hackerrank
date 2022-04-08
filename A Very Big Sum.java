//https://www.hackerrank.com/challenges/a-very-big-sum/problem    

public static long aVeryBigSum(List<Long> ar) {
    // Write your code here
        long sum=0;

        for(long i:ar){
            
            sum+=i;
        }

        return sum;
    }
