package java.Method;

public class MaxofThreeBuiltIn {
    public static void main(String[] args) {
        int a=10,b=20,c=15,d=25;
        int max=Math.max(a, Math.max(b, Math.max(c, d)));
        System.out.println("The maximum of "+a+", "+b+", "+c+" and "+d+" is: "+max);
    }
}
