
//https://www.hackerrank.com/challenges/diagonal-difference/problem

public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here


        int leftSum=0;

        int rightSum=0;


        int r=arr.size();

        for(int i=0;i<r;i++){
            
            
            leftSum+=arr.get(i).get(i);
            
            rightSum+=arr.get(r-r+i).get(r-1-i);
        }
        return Math.abs(leftSum-rightSum);
    }
