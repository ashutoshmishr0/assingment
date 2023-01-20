import java.util.Scanner;

public class question1{
   public static void main(String[] args) {
    Scanner scn =new Scanner(System.in);
    int x=scn.nextInt();
    int y=((((x+8)/3)%5)*5);
    System.out.println(y);
   }
}