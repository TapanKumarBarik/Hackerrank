//https://www.hackerrank.com/challenges/pangrams/problem



 /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
    // Write your code here
    s=s.toLowerCase();
    
        HashSet<Character>set=new HashSet();
        
        int n=s.length();
        
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=' '){
                set.add(s.charAt(i));
            }
        }
        if(set.size()==26){
            return "pangram";
        }
        return "not pangram";
    }
