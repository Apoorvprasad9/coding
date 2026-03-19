import java.util.Scanner;

public class Alphabetsquare4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                if(i%2==1){ // odd row -- lowercase
                    System.out.print((char)(i+96)+" "); 
                }else{ // even row -- uppercase
                    System.out.print((char)(i+64)+" ");
                }
            }
            System.out.println();
        }
    }
}
