import java.util.Scanner;

public class task5e {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int row1 = scanner.nextInt();
        int col1 = scanner.nextInt();
        int row2 = scanner.nextInt();
        int col2 = scanner.nextInt();

        int rowDiff = Math.abs(row1 - row2);
        int colDiff = Math.abs(col1 - col2);

        if ((rowDiff == 2 && colDiff == 1) ||
                (rowDiff == 1 && colDiff == 2)) {

            System.out.println("YES");

        } else {

            System.out.println("NO");
        }

        scanner.close();
    }
}