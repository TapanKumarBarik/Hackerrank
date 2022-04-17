//https://www.hackerrank.com/challenges/angry-professor/problem









  public static String angryProfessor(int k, List<Integer> a) {
    // Write your code here
    int n=a.size();
   int count=0;
    
    for(int i=0;i<n;i++){
        
        if(a.get(i)<=0 ){
            count++;
           
        }
    }
    
    
    if(count>=k){
        return "NO";
         
    }
    
   return "YES";
    }
