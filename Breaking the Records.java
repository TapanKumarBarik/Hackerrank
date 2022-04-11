//https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem



 public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here

int n=scores.size();
int[] minArray=new int[n];
minArray[0]=scores.get(0);
int [] maxArray=new int[n];
maxArray[0]=scores.get(0);

for(int i=1;i<n;i++){
    
    minArray[i]=Math.min(minArray[i-1],scores.get(i));
     maxArray[i]=Math.max(maxArray[i-1],scores.get(i));
}

 List<Integer>arr=new ArrayList();
 
 int maxCount=0;
 int minCount=0;
 
 for(int i=1;i<n;i++){
     
     if(minArray[i]!=minArray[i-1])minCount++;
     if(maxArray[i]!=maxArray[i-1])maxCount++;
 }
 arr.add(maxCount);
 arr.add(minCount);
 
 return arr;
    }


