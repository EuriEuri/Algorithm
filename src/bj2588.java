import java.util.Scanner;
public class bj2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a*(b%10));
        System.out.println(a*(b%100/10));
        System.out.println(a*(b%1000/100));
        System.out.println( (a*(b%10)) + ((a*(b%100/10))*10) + ((a*(b%1000/100))*100) );
    }
}
/*
1의 자리 : n%10
10의 자리 : n%100/10
100의 자리 : n%1000/100
1000의 자리 : n%10000/1000
10000의 자리 : n/10000
 */
