//https://www.hackerrank.com/challenges/the-hurdle-race/problem



    public static int hurdleRace(int k, List<Integer> height) {
    // Write your code here
    
    
    int max=Integer.MIN_VALUE;
    
    for(int num:height){
        max=Math.max(max, num);
    }
    
    if(k>=max)return 0;
    
    return max-k;

    }
