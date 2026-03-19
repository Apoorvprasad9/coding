import java.util.Scanner;

public class oddNumberTriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Row :");
        int N=sc.nextInt();
        
        for(int i=1;i<=N;i++){
            int A=1;
            for(int j=1;j<=i;j++){
                System.out.print(A+" ");
                A+=2;
            }
            System.out.println();
        }
    }
}
