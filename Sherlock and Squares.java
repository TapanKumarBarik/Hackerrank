//https://www.hackerrank.com/challenges/sherlock-and-squares/problem





 /*
     * Complete the 'squares' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER a
     *  2. INTEGER b
     */

    public static int squares(int a, int b) {
    // Write your code here
        int i=1;
        for( i=1;i*i<=a;i++){
            
        }
        
        i--;
        
        int count=0;
        for(int j=i;j*j<=b;j++){
            int curr=j*j;
            if(curr>=a && curr<=b){
                count++;
            }
        }
        return count;

    }
