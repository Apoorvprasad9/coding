import java.util.Scanner;

public class starTriangleHorizontallyFlipped {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number :");
        int N=sc.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N+1-i;j++){
                //for(int j=n;j>=i;j--)
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}
