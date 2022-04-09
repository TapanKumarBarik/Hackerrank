//https://www.hackerrank.com/challenges/time-conversion/problem



 public static String timeConversion(String s) {
    // Write your code here
    
    
    String res="";
    int n=s.length();
   char time=s.charAt(n-2);
   
   
   String currString=s.substring(0, n-2);
   
   if(time=='A'){
       
       
       int hh=Integer.parseInt(s.substring(0, 2) );
       
       if(hh==12)hh=0; 
       
       String temp=""+hh;
       if(temp.length()==1){
           temp="0"+temp;
       } 
       
       res=temp+currString.substring(2,currString.length());
   }
   else{
              int hh=Integer.parseInt(s.substring(0, 2) );
       
       if(hh!=12)hh+=12; 
       
       String temp=""+hh;
       if(temp.length()==1){
           temp="0"+temp;
       } 
       
       res=temp+currString.substring(2,currString.length());
   }
return res;
    }
