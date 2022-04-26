//https://www.hackerrank.com/challenges/permutation-equation/problem




  /*
     * Complete the 'permutationEquation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY p as parameter.
     */

    public static List<Integer> permutationEquation(List<Integer> p) {
    // Write your code here
    
    List<Integer>arr=new ArrayList();
    int n=p.size();
    
    HashMap<Integer,Integer>map=new HashMap();
    
    for(int i=0;i<n;i++){
        
        int temp=p.get(i);
        
       map.put(temp,i+1);
     
    }
    
    for(int i=0;i<n;i++){
        
        arr.add(map.get(map.get(i+1))  );
    }
return arr;
    }
