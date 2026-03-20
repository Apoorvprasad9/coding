import java.util.Scanner;

public class AlphabetTringleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Row :");    
        int N=sc.nextInt();
        for(int i=1;i<=N;i++) {
            for(int j=1;j<=N-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                if(i%2==1){ // odd row -- lowercase
                    System.out.print((char)(i+96)+" "); 
                }else{ // even row -- uppercase
                    System.out.print((char)(i+64)+" ");
                }
            }
            System.out.println();

        }
        
    }
}

//output
/*
        a 
      B B 
    c c c 
  D D D D
e e e e e

*/