//https://www.hackerrank.com/challenges/taum-and-bday/problem

 /*
     * Complete the 'taumBday' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER b
     *  2. INTEGER w
     *  3. INTEGER bc
     *  4. INTEGER wc
     *  5. INTEGER z
     */
      
       //     long z = in.nextLong();b    w        x       y       z
    public static long taumBday(int b, int w, int bc, int wc, int z) {
    // Write your code here
           
                long  result1=(b*bc)+ (w* (bc+z));
              long result2=(w*wc)+(b*(wc+z));
             long result3=(b*bc)+(w*wc);
             
            return Math.min(Math.min(result2,result1) ,result3);
    }
