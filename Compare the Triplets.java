//https://www.hackerrank.com/challenges/compare-the-triplets/problem




 public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    // Write your code here
        List<Integer>res=new ArrayList();

        int n=a.size();
        int num1=0;
        int num2=0;
        for(int i=0;i<n;i++){
            
            if(a.get(i)>b.get(i)  )num1++;
            if(b.get(i)>a.get(i)  )num2++;
        }

        res.add(num1);
        res.add(num2);

        return res;
    }
