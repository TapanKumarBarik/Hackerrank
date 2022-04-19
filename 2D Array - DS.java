//https://www.hackerrank.com/challenges/2d-array/problem



public static int hourglassSum(List<List<Integer>> arr) {
    // Write your code here
    
    int row=arr.size();
    
    int column=arr.get(0).size();
    int max=Integer.MIN_VALUE;
    
    for(int i=0;i<row-2;i++){
        
        for(int j=0;j<column-2;j++){
            int sum=0;
            sum=arr.get(i).get(j)+
                arr.get(i).get(j+1)+
                arr.get(i).get(j+2)+
                arr.get(i+1).get(j+1)+
                arr.get(i+2).get(j)+
                arr.get(i+2).get(j+1)+
                arr.get(i+2).get(j+2)
           ;
    
    max=Math.max(max, sum);
        }
    }
    
    return max;

    }
