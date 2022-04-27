//https://www.hackerrank.com/challenges/library-fine/problem



/*
     * Complete the 'libraryFine' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER d1
     *  2. INTEGER m1
     *  3. INTEGER y1
     *  4. INTEGER d2
     *  5. INTEGER m2
     *  6. INTEGER y2
     */

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
    // Write your code here
    
    if(y1!=y2){
        if(y1<y2){
            return 0;
        }
        return 10000;
    }
    
    if(m1!=m2){
        if(m1<m2){
            return 0;
        }
        return Math.abs(m1-m2)*500;   
    }
    
     if(d1!=d2){
           if(d1<d2){
            return 0;
        }
         return Math.abs(d1-d2)*15;
     }
     return 0;

    }
