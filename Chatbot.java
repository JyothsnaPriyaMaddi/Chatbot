import java.util.Scanner;

import javax.naming.ldap.ManageReferralControl;

public class Chatbot{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        String name = scanner.nextLine();

        System.out.println("\nHi "+name+"! I'm Javabot. Where are you from?");
        String place = scanner.nextLine();

        System.out.println("\nI hear it's beautiful at "+place+" I'm from a place called Oracle");
        System.out.println("\nHow old are you?");
        int age = scanner.nextInt();

        System.out.println("\nSo you are "+age+"I'm 400 years old.\nThis means I'm 8 times older than you.");
        System.out.println("\nEnough about me. What is your favorite langauge?(just don't say Python)");
        scanner.nextLine();
        String language = scanner.nextLine();

        System.out.println("\n"+language+", that's great. Nice talking to you "+name+" I have to log off now. See ya!\n");
    }
}