package assingment2;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String name=scn.next();
        scn.next();
        int roll=scn.nextInt(); 
        String fild=scn.next();
        System.out.println("Name:"+" "+name );
        System.out.println("Roll Number:"+" "+roll );
        System.out.println("Fild of interest"+" "+fild );
    }
}
