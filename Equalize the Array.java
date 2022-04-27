//https://www.hackerrank.com/challenges/equality-in-a-array/problem



/*
     * Complete the 'equalizeArray' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int equalizeArray(List<Integer> arr) {
    // Write your code here
        HashMap<Integer, Integer>map=new HashMap();
        int n=arr.size();
        
        for(int i=0;i<n;i++){
            int curr=arr.get(i);
            if(map.containsKey(curr)){
                int freq=map.get(curr);
                map.put(curr, freq+1);
            }
            else{
                map.put(curr,1);
            }
        }

        //itreate the map
        int max=0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        max=Math.max(max, entry.getValue());
        }
        return n-max;
    }

