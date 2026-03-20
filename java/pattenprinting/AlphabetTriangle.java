import java.util.Scanner;

public class AlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number :");
        int N=sc.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}

//output
/*
A 
A B
A B C
A B C D 
A B C D E
*/