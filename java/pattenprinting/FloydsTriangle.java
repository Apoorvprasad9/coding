import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Row :");
        int N=sc.nextInt();
        int A=1;
        for(int i=1;i<=N;i++){
            
            for(int j=1;j<=i;j++){
                System.out.print(A+" "); 
                A++;
            }
            System.out.println();
        }
    }
}
