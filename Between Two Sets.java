//https://www.hackerrank.com/challenges/between-two-sets/problem


lcm of first array

gcd of second 

common





   public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
    
    //lcm of a
    
    int lcm=a.get(0);
    
    for( int i :a){
        
        lcm=(i*lcm)/findGcd(i,lcm);
    }
    
    int gcd=b.get(0);
    
    for(int i:b){
        gcd=findGcd(gcd, i);
    }
    
    int result=0;
    int lcm_temp=lcm;
    while(lcm<=gcd){
        
        
        if(gcd%lcm==0)result++;
        
        lcm+=lcm_temp;
    }
    
    return result;

    }
    /////////////////////
    static int findGcd(int num1, int num2){
        
        
        if(num2==0)return num1;
        return findGcd(num2, num1%num2);
    }
