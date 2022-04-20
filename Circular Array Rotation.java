//https://www.hackerrank.com/challenges/circular-array-rotation/problem



   /*
     * Complete the 'circularArrayRotation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER k
     *  3. INTEGER_ARRAY queries
     */

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
    // Write your code here


        int n=a.size();
        k=k%n;

        reverse(a, 0,n-1);

        reverse(a, 0,k-1);
        reverse(a, k,n-1);

        List<Integer>arr=new ArrayList();

        for(int i=0;i<queries.size();i++){
            
            arr.add(a.get(queries.get(i)) );
        }
        return arr;
    }
    
    private static void reverse(List<Integer> a, int start, int end){
        
        
        while(start<end){
            swap(a, start, end);
            start++;
            end--;
        }
    }
    
    private static void swap(List<Integer> a, int start, int end){
        int temp=a.get(start);
        a.set( start,a.get(end));
        a.set( end,temp);
    }
