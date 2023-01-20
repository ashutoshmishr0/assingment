import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int x=scn.nextInt();
        int sum=0,y=0,t=3;
        for(int i=0;i<t;i++){
        y=x%10;
        sum=sum+y;
        x=x/10;
        }
        System.out.println(sum);
    }
}
