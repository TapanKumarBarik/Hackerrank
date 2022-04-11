//https://www.hackerrank.com/challenges/bon-appetit/problem



    public static void bonAppetit(List<Integer> bill, int k, int b) {
    // Write your code here

        int annaEat=0;
        int n=bill.size();

        for(int i=0;i<n;i++){
            
            if(i!=k){
                annaEat+=bill.get(i);
            }
        }

        if((annaEat/2)==b ){
            System.out.println("Bon Appetit");
        }

        else{
            System.out.println(b-(annaEat/2));
        }

    }
