//https://www.hackerrank.com/challenges/picking-numbers/problem




 public static int pickingNumbers(List<Integer> a) {
    // Write your code here
    
    
    if(a.size()==0)return 0;
    Collections.sort(a);
    
    int max=1;
    
    int count=1;
    int currNo=a.get(0);
    int n=a.size();
    for(int i=1;i<n;i++){
        
        if(a.get(i)==currNo || a.get(i)==currNo+1 ){
            
            count++;
        }
        
        else{
            
            max=Math.max(max, count);
            currNo=a.get(i);
            count=1;
        }
    }
        return Math.max(max, count);
    }
