
//https://www.hackerrank.com/challenges/migratory-birds/problem



    public static int migratoryBirds(List<Integer> arr) {
    // Write your code here

            int n=arr.size();
            int[]temp=new int[n+1];

            for(int i=0;i<n;i++){
                
                
                temp[arr.get(i)]++;
            }

            int maxIndex=0;

            int max=0;

            for(int i=0;i<n+1;i++){
                
                if(temp[i]>max){
                    
                    max=temp[i];
                    maxIndex=i;
                    
                }
            }
            return maxIndex;

    }
