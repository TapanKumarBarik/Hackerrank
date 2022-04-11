//https://www.hackerrank.com/challenges/sock-merchant/problem



 public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
        HashMap<Integer, Integer>map=new HashMap();

        for(int i :ar){
            
        if(map.containsKey(i) ){
                map.put(i, map.get(i)+1 );
        }
        else{
                map.put(i, 1 );
        }
        }

        //iterate the map
        int res=0;
        for(int freq:map.values()){
            
            res+=freq/2;
        }
        return res;


    }
