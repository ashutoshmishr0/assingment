package assingment2;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int x=scn.nextInt();
        int y=scn.nextInt();
        int z=scn.nextInt();
        int t=x+y+z;
        int p=(t*100)/300;
        System.out.println("Total marks:"+t);
        System.out.println("Percentage marks:"+p+"%");
    }
}
