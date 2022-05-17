//https://www.hackerrank.com/challenges/minimum-distances/problem


 /*
     * Complete the 'minimumDistances' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int minimumDistances(List<Integer> a) {
    // Write your code here
    
    HashMap<Integer,Integer>map=new HashMap();
    
    int n=a.size();
    int min=Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
        int curr=a.get(i);
        if(map.containsKey(curr)){
            min=Math.min(min, i-map.get(curr));
        }
        
        map.put(curr, i);
    }
    if(min==Integer.MAX_VALUE){
        return -1;
    }
    return min;
    }
