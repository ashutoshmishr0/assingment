import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int y=scn.nextInt();
        int z;
        z=x;
        x=y;
        y=z;
        System.out.println(x +","+ y);
    }
}
