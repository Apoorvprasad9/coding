import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int N = sc.nextInt();

        for(int i=1;i<=N;i++){
            for (int j = 1; j <= N-i; j++) {//spaces
                System.out.print("  ");
                
            }
            for(int j=1;j<=2*i-1;j++){ //stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//output
/*
        * 
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
*/
