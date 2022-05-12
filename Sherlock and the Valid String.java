//https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem








 /*
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isValid(String s) {
    // Write your code here
    int[]arr=new int[26];
    int n=s.length();
    if(n==1)return "YES";
    for(int i=0;i<n;i++){
        
        arr[s.charAt(i)-'a']++;
        
    }
    int flag=0;
    
    
    int num= arr[s.charAt(0)-'a'];
    for(int i=0;i<26;i++){
        
        if(arr[i]!=0 ){
            
       if(arr[i]!=num){
           flag++;
           
           if(flag>1){
               break;
           }
       }
        }
        
    }
    
    if(flag==1){
        return "YES";
    }
 
    return "NO";
    }
