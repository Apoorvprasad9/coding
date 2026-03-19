import java.util.Scanner;

public class Alphabetsquare3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number :");
        int N=sc.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                // System.out.print((char)(i+64)+" ");
                System.out.print();
            }
            System.out.println();
        }
    }
}
