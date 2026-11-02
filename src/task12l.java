
import java.util.Scanner;

public class task12l {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();

        int batches = (2 * n + k - 1) / k;

        if (batches < 2) {
            batches = 2;
        }

        long time = (long) batches * m;

        System.out.println(time);
    }
}
