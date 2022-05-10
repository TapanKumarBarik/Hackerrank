//https://www.hackerrank.com/challenges/array-left-rotation/problem


  /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    // Write your code here
    
    
        int n=arr.size();
        d=d%n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, n-d-1);
        reverse(arr, n-d, n-1);
        return arr;
    }
    private static void reverse(List<Integer>arr, int i, int j){
        
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    private static void swap(List<Integer>arr, int i, int j){
        int temp=arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
