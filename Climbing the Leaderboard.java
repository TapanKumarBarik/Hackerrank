//https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem


//sol 1

   /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
    // Write your code here
    
    HashMap<Integer,Integer>map=new HashMap();
    
    int n=ranked.size();
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    int index=1;
    
    for(int i=0;i<n;i++){
        int curr=ranked.get(i);
        min=Math.min(min, curr);
        max=Math.max(max, curr);
        if(!map.containsKey(curr)){
             map.put(curr, index);
            index++;
        } 
    }
//

    int m=player.size();
    List<Integer>arr=new ArrayList();
    for(int i=0;i<m;i++){
        
        int curr=player.get(i);
        
        if(curr>=max){
            arr.add(1);
            continue;
        }
        else if(curr<min){
            arr.add(index);
            continue;
        }
        
        else{
            
            if(map.containsKey(curr)){
                arr.add(map.get(curr));
            }
            else{
                
                while(!map.containsKey(curr)){
                    curr--;
                }
                arr.add(map.get(curr));
            }
        }
        
    }
    
    //return
    return arr;


    }


/////////////////////////////////////////////////////
