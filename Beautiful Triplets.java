//https://www.hackerrank.com/challenges/beautiful-triplets/problem


//brut force


/*
     * Complete the 'beautifulTriplets' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static int beautifulTriplets(int d, List<Integer> arr) {
    // Write your code here
  int count=0;
    int n=arr.size();
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            
            if(arr.get(j)-arr.get(i)  == d){
                  for(int k=j+1;k<n;k++){
                
                if(arr.get(k)-arr.get(j)  == d    ){
                    count++;
                }
            }
            }
          
            
        }
    }
         return count;
    }
