//https://www.hackerrank.com/challenges/staircase/problem


public static void staircase(int n) {
    // Write your code here
    
    for(int i=0;i<n;i++){
  
        for(int j=0;j<n;j++){
            
            if(j>n-i-2){
                System.out.print("#");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println("");
    }

    }
