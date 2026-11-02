
import java.util.Scanner;

public class task11k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        if (k >= 3 && (k % 3 == 0 || k % 5 == 0 || k % 3 == 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
