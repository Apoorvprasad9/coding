// package java.Array;

import java.util.Scanner;

public class arraysum {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array length :");
        int N=sc.nextInt();
        int[] arr = new int[N];
        int sum =0;
        System.out.println("Enter array element :");
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        
        }
        for(int i=0;i<N;i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
