package stringfunctions;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        System.out.println(str.hashCode());
        System.out.println(str.toLowerCase());
        System.out.println(str.concat(str1));
        System.out.println(str.charAt(4));
        System.out.println(str.equals(str1));
        System.out.println(str1.toUpperCase());
    }
}
