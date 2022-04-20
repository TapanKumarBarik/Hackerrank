//https://www.hackerrank.com/challenges/the-birthday-bar/problem



 public static int birthday(List<Integer> s, int d, int m) {
    // Write your code here

        int count=0;

        int sum=0;
        for(int i=0;i<m;i++){
            
            sum+=s.get(i);
        }
        if(sum==d){
                count++;
            }
        for(int i=m;i<s.size();i++){
            
        
            sum-=s.get(i-m);
            sum+=s.get(i);
            if(sum==d){
                count++;
            }
        }
        
        return count;
    }
