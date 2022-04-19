//https://www.hackerrank.com/challenges/arrays-ds/problem



 public static List<Integer> reverseArray(List<Integer> a) {
    // Write your code here
    List<Integer>arr=new ArrayList();
    
    int n=a.size();
    
    for(int i=n-1;i>=0;i--){
        
        arr.add(a.get(i));
    }
    return arr;
    }
