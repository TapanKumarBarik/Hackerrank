//https://www.hackerrank.com/challenges/save-the-prisoner/problem


 /*
     * Complete the 'saveThePrisoner' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER m
     *  3. INTEGER s
     */

    public static int saveThePrisoner(int n, int m, int s) {
    // Write your code here
    int num= m%n;
    
    if ((num+s-1)%n==0)return n;
    
    return (num+s-1)%n;
    }
