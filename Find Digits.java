//https://www.hackerrank.com/challenges/find-digits/problem



 /*
     * Complete the 'findDigits' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int findDigits(int n) {
    // Write your code here
        String s=""+n;
        
        int res=0;
        
        for(int i=0;i<s.length();i++){
            int curr=s.charAt(i)-'0';
            if(curr!=0){
                
                if(n%curr==0)res++;
            }
        }
        return res;


    }
