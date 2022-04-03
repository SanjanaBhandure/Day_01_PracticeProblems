package Bridgelabz;
import java.util.Scanner;

public class StringEquality {
    public static void main(String[] args) {
        // Scanner class is used for taking Input from the User
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1: ");
        String str1 = sc.nextLine();
        System.out.println("Enter String 2: ");
        String str2 = sc.nextLine();

        //str1.equals(str2)= returns true if the given string1 is equal to string2 otherwise false
        if (str1.equals(str2)) {
            System.out.println("Strings are Equals");
        } else {
            System.out.println("Strings are not Equal");
        }
    }
}
