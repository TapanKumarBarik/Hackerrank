//https://www.hackerrank.com/challenges/counting-valleys/problem


 public static int countingValleys(int steps, String path) {
    // Write your code here
    
    int[]arr=new int[steps+1];
    
    int n=arr.length;
    
    for(int i=1;i<n;i++){
        
        if(path.charAt(i-1)=='U'){
            arr[i]=arr[i-1]+1;
        }
        else{
            arr[i]=arr[i-1]-1;
        }
    }
    
    int res=0;
    for(int i=1;i<n;i++){
        
        if(arr[i]==0  && arr[i-1]<0){
            res++;
        }
    }
    return res;
    

    }
