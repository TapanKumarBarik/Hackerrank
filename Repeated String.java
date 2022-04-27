//https://www.hackerrank.com/challenges/repeated-string/problem



 /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
    // Write your code here
    
    //first count no of a
    
    long count=0;
    
        if(s.length()>n){
            for(int i=0;i<n;i++){
                    if(s.charAt(i)=='a'){
                        count++;
                    }
            }
            return count;
        }
    
    //if n is big
    for(int i=0;i<s.length();i++){
        
        if(s.charAt(i)=='a'){
            count++;
        }
    }
    
    //
    count*=n/s.length();
    
    
    //
    for(int i=0;i<n%s.length();i++){
        if(s.charAt(i)=='a'){
            count++;
        }
    }
    return count;
    }
