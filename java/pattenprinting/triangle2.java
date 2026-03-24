import java.util.Scanner;

public class triangle2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=N-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//output
/*
 * * * * * 
    * * * *
      * * *
        * *
          *
*/
