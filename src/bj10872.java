import java.util.Scanner;
public class bj10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        if (n>=1 && n<=12) {
            for (int i=n; i>=1; i--){
                sum = sum * i;
            }
            System.out.println(sum);
        }
        else if (n == 0)
            System.out.println(1);
    }
}
