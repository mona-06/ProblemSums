package Set3.Vowels;

import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine().toLowerCase();

        int count = 0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'|ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.print("Number of vowels: "+count);
    }
}
