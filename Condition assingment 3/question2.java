import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int y=scn.nextInt();
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println(x);
        System.out.println(y);

    }
}
