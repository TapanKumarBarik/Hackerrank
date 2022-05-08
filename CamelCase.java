//https://www.hackerrank.com/challenges/camelcase/problem



    /*
     * Complete the 'camelcase' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int camelcase(String s) {
    // Write your code here
    
    if(s.length()==0)return 0;
    int count=1;
    
    for(int i=0;i<s.length();i++ ){
        
        int num = s.charAt(i);
            if (num >= 65 && num <= 90) {
                count++;
            }
    }
    return count;
    }
