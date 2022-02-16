import java.util.Scanner;
public class bj18108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int years = sc.nextInt();
        if (years >= 1000 && years <= 3000) {
            System.out.println(years - 543);
        }
        else {
            return;
        }
    }
}