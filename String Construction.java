//https://www.hackerrank.com/challenges/string-construction/problem



    /*
     * Complete the 'stringConstruction' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int stringConstruction(String s) {
    // Write your code here
    
    int[]arr=new int[27];
    
    int n=s.length();
    int count=0;
    for(int i=0;i<n;i++){
        
        if(arr[s.charAt(i)-'a']==-1){
            continue;
        }
        else{
            arr[s.charAt(i)-'a']=-1;
            count++;
        }
    }
    return count;
    }
