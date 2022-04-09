//https://www.hackerrank.com/challenges/mini-max-sum/problem



    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here


        int maxSum=Integer.MIN_VALUE;

        int minSum=Integer.MAX_VALUE;
        int n=arr.size();
        long sum=0;

        for(int i=0;i<n;i++){
            
            maxSum=Math.max(maxSum, arr.get(i) );
            minSum=Math.min(minSum, arr.get(i) );
            
            sum+=arr.get(i);
            
        }

        System.out.print(sum-maxSum );
        System.out.print(" ");
        System.out.print(sum-minSum);
    }
