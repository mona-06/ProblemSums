package Set1.FirstNaturalNumbers;

import java.util.Scanner;

public class FirstNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n=sc.nextInt();

        int sum=n*(n+1)/2;
        System.out.println("The sum is "+sum);
    }
}
