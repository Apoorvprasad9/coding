import java.util.Scanner;

public class starPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Row: ");
        int M = sc.nextInt();

        System.out.print("Enter Column: ");
        int N = sc.nextInt();

        int midRow = M / 2 + 1;
        int midCol = N / 2 + 1;

        for(int i = 1; i <= M; i++){
            for(int j = 1; j <= N; j++){
                if(i == midRow || j == midCol){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

//output
/*
    *     
    *
* * * * *
    *
    *
*/