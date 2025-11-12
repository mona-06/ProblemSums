package Set2.Fibonacci;

import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int n = sc.nextInt();

        int a=0,b=1,next;
        for(int i=1;i<=n;i++)
        {
            System.out.print(a+" ");
            next=a+b;
            a=b;
            b=next;
        }
    }
}
