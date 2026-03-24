import java.util.Scanner;

public class OutputInputArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int[] arr = {5,8,6,7,5,2}; //array length =6
        // System.out.println(arr.length);
        // //arr.length means index 0 to n-1 
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]+" ");
        // }
         
        //defalut values
        int[] apoorv = new int[7];
        // for(int i=0;i<apoorv.length;i++){
        //     System.out.println(apoorv[i]);
        // }
        
        //input
        for(int i=0;i<7;i++){
           apoorv[i]=sc.nextInt();
        }

        //print 
        for(int i=0;i<7;i++){
            System.out.println(2+apoorv[i]+" ");
        }


    }
}
