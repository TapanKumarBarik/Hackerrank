//https://www.hackerrank.com/challenges/cats-and-a-mouse/problem



  public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn=new Scanner (System.in);
        
        
        
        int k=scn.nextInt();
        int [][]arr=new int[k][3];
        
        for(int i=0;i<k;i++){
            
            for(int j=0;j<3;j++){
                
                arr[i][j]=scn.nextInt();
            }
        }
        
     
        
    for(int i=0;i<arr.length;i++){
        
        
        int a=arr[i][0];
        int b=arr[i][1];
        int c=arr[i][2];
            if(Math.abs(a-c) >Math.abs(b-c)){
            System.out.println("Cat B");
        }
            else if(Math.abs(a-c) <Math.abs(b-c)){
            System.out.println("Cat A");
        }
        
        else{
            System.out.println("Mouse C");
        }
    }
    }
