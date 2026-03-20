import java.util.Scanner;

public class NumberTriangleHorizontallyFlipped {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number :");
        int N=sc.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N+1-i;j++){
                //for(int j=n;j>=i;j--)
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
//output
/*
1 2 3 4 5 
1 2 3 4
1 2 3
1 2
1
*/