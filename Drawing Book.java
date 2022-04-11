//https://www.hackerrank.com/challenges/drawing-book/problem


    public static int pageCount(int n, int p) {
    // Write your code here
    
    if(p-1 < n-p){
        
        return p/2; 
    }
    
    else if(n%2==0 && n-p==1)return 1;
    return (n-p)/2;
    }
