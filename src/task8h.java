
import java.util.Scanner;

public class task8h {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        if (a == 0) {
            if (b == 0) {
                System.out.println("INF");
            } else {
                System.out.println("NO");
            }
        } else {
            if (b % a == 0) {
                System.out.println(-b / a);
            } else {
                System.out.println("NO");
            }
        }
    }
}
