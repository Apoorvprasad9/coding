import java.util.Scanner;

public class pyramid2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int N = sc.nextInt();
        int nsp=N-1; 
        int nst=1;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=nsp;j++){ //spaces
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++){ //stars
                System.out.print("* ");
            }
            nsp--;
            nst+=2;
            System.out.println();

        }
    }
}

//output
/*
        * 
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
*/
