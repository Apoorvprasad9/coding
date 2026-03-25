// package java.Array;

import java.util.Scanner;

public class arrayproduct {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length :");
        int N = sc.nextInt();
        int[] arr = new int[N];
        int pro=1;
        System.out.print("Enter array Element :");
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            pro *=arr[i];
        }
        System.out.println(pro);
    }
}
