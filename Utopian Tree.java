//https://www.hackerrank.com/challenges/utopian-tree/problem




    public static int utopianTree(int n) {
    // Write your code here
    int res=1;
    
    for(int i=1;i<=n;i++){
        
        if(i%2==0){
            res++;
        }
        else{
            res*=2;
        }
    }
    return res;
    
    }
