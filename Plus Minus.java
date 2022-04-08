 
//LEARNING
//String.format("%.6f", DOUBLE)



//https://www.hackerrank.com/challenges/plus-minus/problem

public static void plusMinus(List<Integer> arr) {
    // Write your code here
    
    int n=arr.size();
    
    double pos=0.0;
    double neg=0.0;
    double zero=0.0;
    
    for(int i=0;i<n;i++){
        int num=arr.get(i);
        
        if(num>0){
            pos++;
        }
         if(num<0){
            neg++;
        }
        if(num==0){
            zero++;
        }
    }
    
    double first=pos/n;
    //System.out.println(first);
    System.out.println(String.format("%.6f", first));
    double second=neg/n;
       System.out.println(String.format("%.6f", second));
   // System.out.println(second);
     double third=zero/n;
        System.out.println(String.format("%.6f", third));
    //System.out.println(third);
    }
