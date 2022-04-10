//https://www.hackerrank.com/challenges/apple-and-orange/problem




 public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
    
    //s start of the house
    //t end of house
    //a apple 
    //b orange
    
    int appleSum=0;
    int orangeSum=0;
    for(int i=0;i<apples.size();i++){
        
        if((a+apples.get(i) >=s) && (a+apples.get(i) <=t) ){
            appleSum++;
        }
    }
        for(int i=0;i<oranges.size();i++){
        
        if((b+oranges.get(i) >=s) && (b+oranges.get(i) <=t) ){
            orangeSum++;
        }
    }
     System.out.println(appleSum);
    System.out.println(orangeSum);

    }

}
