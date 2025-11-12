package Set2.Palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String rev = "";
        int s=str.length();
        for (int i = s-1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
