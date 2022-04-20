//https://www.hackerrank.com/challenges/strange-advertising/problem


    public static int viralAdvertising(int n) {
    // Write your code here
       
        int shared=5;
        int liked=2;
       
        for(int i=2;i<=n;i++){
            
            shared=(shared/2)*3;
            liked+=(shared/2);
        }
        return liked;
    }
