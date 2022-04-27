//https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem




 /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */

    public static int jumpingOnClouds(List<Integer> c) {
    // Write your code here
    int currentPosition=0;
    int noOfCloud=0;
    
    int n=c.size();
    int i=0;
    int step=0;
    while(i<n){
  
        int temp=i+2;
        if(temp<n  ){
        if(c.get(temp)==1){
           temp--; 
        }
        
        i=temp;
        step++;
            
        }
        
        //
             else if (temp - 1 < n) {
                temp--;
                if (c.get(temp) == 1) {
                    temp--;
                }

                i = temp;
                step++;
            } else {
                break;
            }
            
            //
    }
    return step;

    }
