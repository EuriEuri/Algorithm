import java.util.Scanner;
public class bj2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if (y >= 1 && y <= 4000) {
            if (y%4==0) {
                if (y%400==0) System.out.printf("1");
                else if (y%100!=0) System.out.printf("1");
                else System.out.printf("0");
            }
            else System.out.println("0");
        }
        else return;
    }
}
