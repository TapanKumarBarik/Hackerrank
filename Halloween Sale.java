//https://www.hackerrank.com/challenges/halloween-sale/problem





    /*
     * Complete the 'howManyGames' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER p
     *  2. INTEGER d
     *  3. INTEGER m
     *  4. INTEGER s
     */

    public static int howManyGames(int p, int d, int m, int s) {
    // Return the number of games you can buy


        if(s<p){
            return 0;
        }
        
        int sum=0;
        int curr=p;
        int count=0;
        
        while(sum<=s){
           
           
            sum+=curr;
            if(sum>s)break;
            count++;
            if(curr-d<=m ){
             curr=m;          
            }
            else{
                 curr-=d;
            }
        }
        return count;
    }

