//https://www.hackerrank.com/challenges/morgan-and-a-string/problem



//incorrect code
    /*
     * Complete the 'morganAndString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */

    public static String morganAndString(String a, String b) {
    // Write your code here
       // char []a1=a.toCharArray();
       // char[]a2=b.toCharArray();
        String s="";
        
        int n=a.length();
        int m=b.length();
        
        int i=0,j=0;
        
        while(i<n && j<m){
            
            if(a.charAt(i)>b.charAt(j)){
                s+=b.charAt(j);
                j++;
            }
            else if(a.charAt(i)<b.charAt(j)){
                s+=a.charAt(i);
                i++;
            }
            
            else{
               s+=a.charAt(i);
               s+=a.charAt(j);
               i++ ;
               j++;
            }
        }
        //
                while(i<n ){
                    s+=a.charAt(i);
                    i++;
                 }
                 
                 
        //
        while( j<m){

                s+=b.charAt(j);
                j++;
        }
        return s;
       
    }


