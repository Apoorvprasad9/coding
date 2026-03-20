import java.util.Scanner;

public class starCross {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Row :");
        int M=sc.nextInt();

        System.out.print("Enter Colume :");
        int N=sc.nextInt();

        for(int i=1;i<=M;i++){
            for(int j=1;j<=N;j++){
                if (i==j || i+j==N+1) {
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
//output
/*

*    * 
 *  *
  *
 *  *
*    *

*/