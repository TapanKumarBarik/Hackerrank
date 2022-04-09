

//https://www.hackerrank.com/challenges/birthday-cake-candles/problem




    public static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
        HashMap<Integer,Integer>map=new HashMap();
        int max=Integer.MIN_VALUE;

        int n=candles.size();
        for(int i=0;i<n;i++){
             max=Math.max(max, candles.get(i) );
            if(map.containsKey(candles.get(i)) ){
                        
            int freq=map.get(candles.get(i));
             map.put(candles.get(i), freq+1);
            }
            else{
            map.put(candles.get(i),1);
            }
        }

 return map.get(max);

            }
