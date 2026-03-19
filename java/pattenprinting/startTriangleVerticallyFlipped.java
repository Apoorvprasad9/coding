import java.util.Scanner;

public class startTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row :");
        int N = sc.nextInt();
          //method 1

        // for (int i = 1; i <= N; i++) {
        //     for (int j = 1; j <= N; j++) {
        //         if((i+j)>N)System.out.print("* ");
        //         else System.out.print("  ");
        //     }
        //     System.out.println();
        // }
        //method 2

        for(int i=1;i<=N;i++){
            for(int j=1;j<=N-i;j++){ //spaces
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){ //stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}