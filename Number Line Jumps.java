//https://www.hackerrank.com/challenges/kangaroo/problem



 public static String kangaroo(int x1, int v1, int x2, int v2) {
    // Write your code here

        if(x1>x2){
            
            if(v1>=v2)return "NO";
            else{
                while(x1>=x2){
                    
                    if(x1==x2)return "YES";
                    x1+=v1;
                    x2+=v2;
                }
            }
        }
        
        //
        else{
            
            if(v1<=v2)return "NO";
            else{
                while(x1<=x2){
                    
                    if(x1==x2)return "YES";
                    x1+=v1;
                    x2+=v2;
                }
            }
        }
        
        
        return "NO";

    }
