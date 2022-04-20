//https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem



   /*
     * Complete the 'beautifulDays' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER i
     *  2. INTEGER j
     *  3. INTEGER k
     */

    public static int beautifulDays(int i, int j, int k) {
    // Write your code here'
    int count=0;
    for(int start=i;i<=j;i++){
        
        StringBuilder sb=new StringBuilder();
        sb.append(i);
        int reverseNum=Integer.parseInt(sb.reverse().toString());
        
        if(isBeautiful(i, reverseNum, k)){
            count++;
        }
    }
    return count;
    

    }
    private static boolean isBeautiful(int date, int reverse, int k){
        
        if(Math.abs(date-reverse)%k==0){
            return true;
        }
        
        return false;
    }
