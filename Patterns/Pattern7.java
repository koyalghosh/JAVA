/*Program to print the following pattern
                    1   
                   121   
                  12321  
                 1234321
*/ 

class Pattern7 {
        public static void main(String args[]){
            int n=5;
            for(int i=0;i<n;i++){
                for(int k=1;k<n-i;k++)
                    System.out.print(" ");//space loop
                for(int j=1;j<=i;j++)
                    System.out.print(j);//first half
                for(int l=i-1;l>=1;l--)
                    System.out.print(l);//second half
                System.out.println();
                /*  ______
                   1|     |
                  12|1    |
    first half   123|21   |second half
                1234|321__|
                */
            }
        }    
}
