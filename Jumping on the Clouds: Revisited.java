//https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        
        Scanner scn=new Scanner (System.in);
        
        int n=scn.nextInt();
        
        int k=scn.nextInt();
        
        ArrayList<Integer>arr=new ArrayList();
        
        for(int i=0;i<n;i++){
            arr.add(scn.nextInt());
        }
        
        
        //we have n , k and the array
        int e=100;
        
        for(int i=0;i<n;i+=k){
            
            if(arr.get(i)==1){
                e-=3;
            }
            else{
                e-=1;
            }
        }
        System.out.println(e);
    }
}
