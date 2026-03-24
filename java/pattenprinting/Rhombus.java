import java.util.Scanner;

public class Rhombus{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int N =sc.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=N;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//output
/*
       * * * * * 
      * * * * *
    * * * * *
  * * * * *
* * * * * 
*/