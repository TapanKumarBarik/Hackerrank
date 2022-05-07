//https://www.hackerrank.com/challenges/cut-the-sticks/problem



//sol1
 /*
     * Complete the 'cutTheSticks' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> cutTheSticks(List<Integer> arr) {
    // Write your code here
   int n=arr.size();
    Collections.sort(arr);
    List<Integer>res=new ArrayList();
    res.add(n);
    for(int i=1;i<n;i++){
        if(arr.get(i)!=arr.get(i-1)){
            res.add(n-i);
        }
    }
    
    return res;
    }
